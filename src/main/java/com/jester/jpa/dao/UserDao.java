package com.jester.jpa.dao;

import com.jester.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;

/**
 * @author Jester
 * @email shujian.jiansite@gmail.com
 * @date 2019-06-30 19:37
 * @version version 1.0.0
 */
@Component
public interface UserDao extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {
}
