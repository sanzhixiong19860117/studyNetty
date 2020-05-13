# 分出一个新的线程来负责数据库的读写

## 创建一个接口进行分开两个线程的函数操作

创建接口 IAsyncOperaction类

```java
package org.async;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/12 19:45
 * 异步操作接口
 */
public interface IAsyncOperaction {
    /**
     * 获取绑定id
     *
     * @return
     */
    default int getBindId() {
        return 0;
    }

    /**
     * 获取异步操作
     */
    void doAsync();

    /**
     * 指定完成逻辑
     */
    default void doFinish() {
    }
}

```



## 创建异步操作线程

创建AsyncOperationProcessor类

```java
package org.async;

import org.joy.game.MainThreadProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/12 19:33
 * 异步操作处理器
 */
public class AsyncOperationProcessor {
    /**
     * 日志
     */
    private static Logger LOGGER = LoggerFactory.getLogger(AsyncOperationProcessor.class);
    /**
     * 单例
     */
    static private final AsyncOperationProcessor _instance = new AsyncOperationProcessor();
    /**
     * 线程数组
     */
    private final ExecutorService[] _esArray = new ExecutorService[8];

    /**
     * 构造函数
     */
    private AsyncOperationProcessor() {
        for (int i = 0; i < _esArray.length; i++) {
            final String threadName = "AsyncOperationProcessor" + i;
            //创建不同的线程放入到线程操作
            _esArray[i] = Executors.newSingleThreadExecutor((newRunnable) -> {
                Thread newThread = new Thread(newRunnable);
                newThread.setName(threadName);
                return newThread;
            });
        }
    }

    /**
     * 获取单例对象
     */
    public static AsyncOperationProcessor getInstance() {
        return _instance;
    }

    /**
     * 异步操作数据部分
     */
    public void process(IAsyncOperaction asynOp){
        if(asynOp == null){
            return;
        }

        //核心部分
        int bindId = Math.abs(asynOp.getBindId());
        int esIndex = bindId % _esArray.length;

        _esArray[esIndex].submit(()->{
            try{
                //执行异步操作
                asynOp.doAsync();
                //回到主线程
          MainThreadProcessor.getInstance().process(asynOp::doFinish);
            }catch (Exception e){
                LOGGER.error(e.getMessage(),e);
            }
        });
        //核心结束
    }
}
```

这里写出了核心部分的代码，是用一个线程组根据线程的名字摸出一个结果来以后每次根据名字都是这个对应的线程，这样就不会出现多个线程抢占一个数据的情况。

最后设计成图121212.png，在文件里面有出现