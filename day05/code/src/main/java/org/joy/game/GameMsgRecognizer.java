package org.joy.game;


import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tinygame.herostory.msg.GameMsgProtocol;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/8 18:10
 * 消息识别器
 */
public final class GameMsgRecognizer {
    /**
     * 日志对象
     */
    static private final Logger LOGGER = LoggerFactory.getLogger(GameMsgRecognizer.class);

    /**
     * 消息代码和消息字典
     */
    static private final Map<Integer, GeneratedMessageV3> _msgCodeAndMsgBodyMap = new HashMap<>();


    /**
     * 消息类型和消息编号字典
     */
    static private final Map<Class<?>, Integer> _msgClazzAndMsgcodeMap = new HashMap<>();

    /**
     * 构造函数变成私有
     */
    private GameMsgRecognizer() {

    }

    /**
     * 初始化数据
     */
    static public void init() {
        Class<?>[] innerClazzArray = GameMsgProtocol.class.getDeclaredClasses();
        for (Class<?> innerClazz : innerClazzArray) {
            if (!GeneratedMessageV3.class.isAssignableFrom(innerClazz)) {
                continue;
            }

            String clazzName = innerClazz.getSimpleName();
            clazzName = clazzName.toLowerCase();

            for (GameMsgProtocol.MsgCode msgCode : GameMsgProtocol.MsgCode.values()) {
                String strMsgCode = msgCode.name();
                strMsgCode = strMsgCode.replace("_", "");//替换code
                strMsgCode = strMsgCode.toLowerCase();//全部变小写
                if (!strMsgCode.startsWith(clazzName)) {
                    continue;
                }

                try {
                    Object returnObj = innerClazz.getDeclaredMethod("getDefaultInstance").invoke(innerClazz);
                    //放入到集合中
                    _msgCodeAndMsgBodyMap.put(
                            msgCode.getNumber(),
                            (GeneratedMessageV3) returnObj
                    );

                    _msgClazzAndMsgcodeMap.put(
                            innerClazz,
                            msgCode.getNumber()
                    );
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 根据消息编号获取构建者
     *
     * @param msgCode
     * @return
     */
    static public Message.Builder getBuilderByMsgCode(int msgCode) {
        if (msgCode < 0) {
            return null;
        }

        GeneratedMessageV3 msg = _msgCodeAndMsgBodyMap.get(msgCode);
        if (null == msg) {
            return null;
        }

        return msg.newBuilderForType();
    }

    /**
     * 根据消息获得消息编号
     *
     * @param msgClazz
     * @return
     */
    static public int getMsgCodeByMsgClazz(Class<?> msgClazz) {
        if (null == msgClazz) {
            return -1;
        }

        Integer msgCode = _msgClazzAndMsgcodeMap.get(msgClazz);
        if (null != msgCode) {
            return msgCode.intValue();
        } else {
            return -1;
        }
    }

}
