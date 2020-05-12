package org.login.db;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/12 16:31
 * 登录服务器
 */

import org.apache.ibatis.session.SqlSession;
import org.joy.game.MySqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 登录服务
 */
public class LoginSerice {
    /**
     * 日志
     */
    static private final Logger LOGGER = LoggerFactory.getLogger(LoginSerice.class);
    /**
     * 单例对象
     */
    static private LoginSerice _inster = new LoginSerice();

    /**
     * 构造函数私有化
     */
    private LoginSerice() {
    }

    /**
     * 获取对象
     */
    public static LoginSerice getInster() {
        return _inster;
    }

    public UserEntiy userLogin(String userName, String passWord) {
        if (null == userName || null == passWord) {
            LOGGER.error("登录用户或者密码不正确");
            return null;
        }

        try (SqlSession mySqlSession = MySqlSessionFactory.openSession()) {
            IUserDao dao = mySqlSession.getMapper(IUserDao.class);

            UserEntiy userEntiy = dao.getUserByName(userName);

            if (null != userEntiy) {
                if (!passWord.equals(userEntiy.getPassWord())) {
                    LOGGER.error("用户密码错误");
                    throw new RuntimeException("用户密码错误");
                }
            } else {
                userEntiy = new UserEntiy();
                userEntiy.setUserName(userName);
                userEntiy.setPassWord(passWord);
                userEntiy.setHeroAvatar("Hero_Shaman");
                //实体类插入到数据库中
                dao.insertInto(userEntiy);
            }
            //sql操作
            return userEntiy;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return null;
        }
    }
}
