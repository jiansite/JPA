package com.jester.jpa.service.impl;

import com.jester.jpa.dao.UserDao;
import com.jester.jpa.entity.User;
import com.jester.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jester
 * @email shujian.jiansite@gmail.com
 * @date 2019-06-30 19:44
 * @version version 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public Object addUser(User user){
        return userDao.save(user);
    }

}
