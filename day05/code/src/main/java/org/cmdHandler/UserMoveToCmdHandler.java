package org.cmdHandler;

import io.netty.channel.ChannelHandlerContext;
import org.tinygame.herostory.msg.GameMsgProtocol;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/9 15:20
 * 移动操作
 */
public class UserMoveToCmdHandler implements ICmdHandler<GameMsgProtocol.UserMoveToCmd> {
    @Override
    public void handle(ChannelHandlerContext ctx, GameMsgProtocol.UserMoveToCmd userMoveToCmd) {
        //第一步判断数据是否为null
        
    }
}
