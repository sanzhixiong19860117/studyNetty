package org.login.db;

import org.apache.ibatis.annotations.Param;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/12 16:16
 * 用户dao操作
 */
public interface IUserDao {
    /**
     * 根据用户名称获取用户实体
     *
     * @param userName 用户名称
     * @return 用户实体
     */
    UserEntiy getUserByName(@Param("userName") String userName);

    /**
     * 添加用户实体
     *
     * @param newUserEntity 用户实体
     */
    void insertInto(UserEntiy newUserEntity);
}
