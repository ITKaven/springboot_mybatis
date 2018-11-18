package com.kaven.springboot_mybatis.controller;

import com.kaven.springboot_mybatis.dao.UserDao;
import com.kaven.springboot_mybatis.domin.UserDomin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot_mybatis
 * @description: 用户数据控制
 * @author: Kaven
 * @create: 2018-11-18 16:23
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/add")
    public int addUser(UserDomin user){
        System.out.println("添加用户成功！");
        return userDao.insert(user);
    }
}
