package org.cmdHandler;

import com.google.protobuf.GeneratedMessageV3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tinygame.herostory.msg.GameMsgProtocol;
import org.util.PackageUtil;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/8 16:33
 * 指令静态工厂类
 */
public final class CmdHandlerFactory {

    static private final Logger LOGGER = LoggerFactory.getLogger(CmdHandlerFactory.class);

    /**
     * 处理器字典
     */
    static private Map<Class<?>, ICmdHandler<? extends GeneratedMessageV3>> _handlerMap = new HashMap<>();

    private CmdHandlerFactory() {
    }

    static public void init() {
//        _handlerMap.put(GameMsgProtocol.UserEntryCmd.class, new UserEntryCmdHandler());
//        _handlerMap.put(GameMsgProtocol.WhoElseIsHereCmd.class, new WhoElseIsHereCmdHandler());
        //获取包名称
        final String packageName = CmdHandlerFactory.class.getPackage().getName();

        //获得搜有deicmadhandler子类
        Set<Class<?>> clazzSet = PackageUtil.listSubClazz(
                packageName,
                true,
                ICmdHandler.class
        );

        for (Class<?> clazz : clazzSet) {
            if ((clazz.getModifiers() & Modifier.ABSTRACT) != 0) {
                //判断是否是抽象类
                continue;
            }

            //获取方法数组
            Method[] methods = clazz.getDeclaredMethods();

            //循环方法
            Class<?> msgType = null;

            for (Method currMethod : methods) {
                if (!currMethod.getName().equals("handle")) {
                    //如果不是handle就不需要执行
                    continue;
                }

                //获取方法的参数
                Class<?>[] paramTypeArray = currMethod.getParameterTypes();

                //判断参数是不是小于2，小于2肯定不是,判断第二个参数是不是我们对应的v3的里面的对象
                if (paramTypeArray.length < 2 ||
                        paramTypeArray[1] == GeneratedMessageV3.class ||
                        !GeneratedMessageV3.class.isAssignableFrom(paramTypeArray[1])) {

                    continue;
                }

                if (null == msgType) {
                    continue;
                }

                try {
                    ICmdHandler<?> newHandler = (ICmdHandler<?>) clazz.newInstance();
                    //打印数据
                    LOGGER.info(
                            "关联{}<==>{}",
                            msgType.getName(),
                            clazz.getName()
                    );
                    _handlerMap.put(msgType, newHandler);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 创建指令处理工厂
     *
     * @param msgClazz
     * @return
     */
    static public ICmdHandler<? extends GeneratedMessageV3> crate(Class<?> msgClazz) {
        if (null == msgClazz) {
            return null;
        }
        return _handlerMap.get(msgClazz);
    }
}
