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
    }


}
