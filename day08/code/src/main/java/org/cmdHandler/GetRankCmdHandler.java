package org.cmdHandler;

import io.netty.channel.ChannelHandlerContext;
import org.rank.RanItem;
import org.rank.RankService;
import org.tinygame.herostory.msg.GameMsgProtocol;

import java.util.Collections;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/14 16:25
 * 排行榜功能
 */
public class GetRankCmdHandler implements ICmdHandler<GameMsgProtocol.GetRankCmd> {
    @Override
    public void handle(ChannelHandlerContext ctx, GameMsgProtocol.GetRankCmd cmd) {
        if(null == ctx || null == cmd){
            return;
        }

        // 获取排行榜数据
        RankService.getInstance().getRank((rankItemList) -> {
            if (null == rankItemList) {
                rankItemList = Collections.emptyList();
            }

            GameMsgProtocol.GetRankResult.Builder
                    resultBuilder = GameMsgProtocol.GetRankResult.newBuilder();

            for (RanItem rankItem : rankItemList) {
                GameMsgProtocol.GetRankResult.RankItem.Builder
                        rankItemBuilder = GameMsgProtocol.GetRankResult.RankItem.newBuilder();

                rankItemBuilder.setRankId(rankItem.rankId);
                rankItemBuilder.setUserId(rankItem.userId);
                rankItemBuilder.setUserName(rankItem.userName);
                rankItemBuilder.setHeroAvatar(rankItem.heroAvatar);
                rankItemBuilder.setWin(rankItem.win);

                resultBuilder.addRankItem(rankItemBuilder);
            }

            GameMsgProtocol.GetRankResult newResult = resultBuilder.build();
            ctx.writeAndFlush(newResult);

            return null;
        });
    }
}
