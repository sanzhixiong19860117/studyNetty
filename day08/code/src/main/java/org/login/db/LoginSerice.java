package org.login.db;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/12 16:31
 * 登录服务器
 */

import org.apache.ibatis.session.SqlSession;
import org.async.AsyncOperationProcessor;
import org.async.IAsyncOperaction;
import org.joy.game.MySqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

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

    public void userLogin(String userName, String passWord, Function<UserEntiy, Void> callback) {
        if (null == userName || null == passWord) {
            LOGGER.error("登录用户或者密码不正确");
            return;
        }

        //2020-5-4修改这里代码
        AsyncGetUserByName asyncGetUserByName = new AsyncGetUserByName(userName, passWord) {
            //重新执行异步操作
            @Override
            public void doFinish() {
                if (null == callback) {
                    //返回函数返回数据
                    callback.apply(this.getUserEntuty());
                }
            }
        };

        //执行异步操纵
        AsyncOperationProcessor.getInstance().process(asyncGetUserByName);
    }


    /**
     * 异步方式获取用户
     */
    private class AsyncGetUserByName implements IAsyncOperaction {

        /**
         * 用户名称
         */
        private String _userName;

        /**
         * 密码
         */
        private String _passWord;

        /**
         * 用户实体
         */
        private UserEntiy _userEntuty = null;


        /**
         * 构造器
         */
        public AsyncGetUserByName(String _userName, String _passWord) {
            if (null == _userName ||
                    null == _passWord) {
                throw new IllegalArgumentException();
            }

            this._userName = _userName;
            this._passWord = _passWord;
        }

        /**
         * 获得用户实体
         */
        public UserEntiy getUserEntuty() {
            return _userEntuty;
        }

        @Override
        public int getBindId() {
            return _userName.charAt(_userName.length() - 1);
        }


        @Override
        public void doAsync() {
            try (SqlSession mySqlSession = MySqlSessionFactory.openSession()) {
                IUserDao dao = mySqlSession.getMapper(IUserDao.class);

                UserEntiy userEntiy = dao.getUserByName(_userName);

                if (null != userEntiy) {
                    if (!_passWord.equals(userEntiy.getPassWord())) {
                        LOGGER.error("用户密码错误 userId={},userName={}", userEntiy.userId, _userName);
                        return;
                    }
                } else {
                    userEntiy = new UserEntiy();
                    userEntiy.setUserName(_userName);
                    userEntiy.setPassWord(_passWord);
                    userEntiy.setHeroAvatar("Hero_Shaman");
                    //实体类插入到数据库中
                    dao.insertInto(userEntiy);
                }
                //sql操作
            } catch (Exception e) {
                LOGGER.error(e.getMessage(), e);
            }
        }
    }
}
