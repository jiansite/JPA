package com.jester.jpa.controller;

import com.jester.jpa.entity.User;
import com.jester.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Jester
 * @email shujian.jiansite@gmail.com
 * @version version 1.0.0
 * @date 2019-06-30 19:48
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user/add/user")
    public Object getUser(User user){
        return userService.addUser(user);
    }
}
