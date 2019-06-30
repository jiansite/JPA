package com.jester.jpa.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @author Jester
 * @email shujian.jiansite@gmail.com
 * @date 2019-06-30 19:35
 * @version version 1.0.0
 */

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
}
