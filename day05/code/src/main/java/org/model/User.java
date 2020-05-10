package org.model;

/**
 * @author joy
 * @version 1.0
 * @date 2020/4/28 22:28
 * 用户操作
 */
public class User {
    //用户id
    public int userId;

    //用户形象
    public String heroAvatar;

    //移动状态
    public final MoveState moveState = new MoveState();

    //血量
    public int currHp;
}
