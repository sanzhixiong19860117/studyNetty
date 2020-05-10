package org.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author joy
 * @version 1.0
 * @date 2020/5/8 12:28
 */
public final class UserManager {
    static private final Map<Integer, User> _userMap = new HashMap<>();

    private UserManager() {
    }

    /**
     * 增加用户操作
     *
     * @param newUser
     */
    public static void addUser(User newUser) {
        if (null == newUser) {
            return;
        }
        _userMap.put(newUser.userId, newUser);
    }

    /**
     * 删除指定用户
     *
     * @param userId
     */
    public static void removeUser(int userId) {
        if (userId < 0) {
            return;
        }
        _userMap.remove(userId);
    }

    /**
     * 获取对应的列表
     * @return
     */
    public static Collection<User> listUser(){
        return _userMap.values();
    }

    public static User getUserById(int UserId){
        if(UserId <= 0){
            return null;
        }
        return _userMap.get(UserId);
    }

}
