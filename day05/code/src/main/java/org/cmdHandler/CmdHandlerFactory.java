package org.cmdHandler;

import com.google.protobuf.GeneratedMessageV3;
import org.tinygame.herostory.msg.GameMsgProtocol;

import java.util.HashMap;
import java.util.Map;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/8 16:33
 * 指令静态工厂类
 */
public final class CmdHandlerFactory {
    /**
     * 处理器字典
     */
    static private Map<Class<?>, ICmdHandler<? extends GeneratedMessageV3>> _handlerMap = new HashMap<>();

    private CmdHandlerFactory() {
    }

    static public void init() {
        _handlerMap.put(GameMsgProtocol.UserEntryCmd.class, new UserEntryCmdHandler());
        _handlerMap.put(GameMsgProtocol.WhoElseIsHereCmd.class, new WhoElseIsHereCmdHandler());
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
