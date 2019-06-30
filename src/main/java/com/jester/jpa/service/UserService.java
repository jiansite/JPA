package com.jester.jpa.service;

import com.jester.jpa.entity.User;

/**
 * @author Jester
 * @email shujian.jiansite@gmail.com
 * @date 2019-06-30 19:43
 * @version version 1.0.0
 */
public interface UserService {

    /**
     * 添加user
     * @param user
     * @return
     */
    Object addUser(User user);
}
