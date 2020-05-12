package org.joy.game;

import org.apache.ibatis.session.*;
import org.apache.ibatis.io.Resources;

import java.sql.Connection;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/12 16:46
 * sql 会话类，工厂操作，使用mybatis进行数据库操作
 */
public class MySqlSessionFactory {

    /**
     * mybatis操作
     */
    static private SqlSessionFactory _sqlSessionFactory = null;

    private MySqlSessionFactory() {
    }

    /**
     * 初始化
     */
    static public void init() {
        try {
            _sqlSessionFactory = (new SqlSessionFactoryBuilder()).build(
                    Resources.getResourceAsStream("mybatis-config.xml")
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 开启mysql连接
     */
    static public SqlSession openSession() {
        if (null == _sqlSessionFactory) {
            throw new RuntimeException("_sqlSessionFactory 尚未初始化");
        }

        return _sqlSessionFactory.openSession(true);
    }
}
