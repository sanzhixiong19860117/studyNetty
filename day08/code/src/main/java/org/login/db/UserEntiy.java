package org.login.db;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/12 16:06
 * 用户登录实体
 */
public class UserEntiy {
    /**
     * 用户id
     */
    public int userId;
    /**
     * 用户姓名
     */
    public String userName;
    /**
     * 用户密码
     */
    public String password;
    /**
     * 用户英雄形象
     */
    public String heroAvatar;

    public UserEntiy() {
    }

    public UserEntiy(int userId, String userName, String passWord, String heroAvatar) {
        this.userId = userId;
        this.userName = userName;
        this.password = passWord;
        this.heroAvatar = heroAvatar;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return password;
    }

    public void setPassWord(String passWord) {
        this.password = passWord;
    }

    public String getHeroAvatar() {
        return heroAvatar;
    }

    public void setHeroAvatar(String heroAvatar) {
        this.heroAvatar = heroAvatar;
    }
}
