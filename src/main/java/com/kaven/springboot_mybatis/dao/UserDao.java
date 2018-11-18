package com.kaven.springboot_mybatis.dao;

import com.kaven.springboot_mybatis.domin.UserDomin;
import org.springframework.stereotype.Service;

/**
 * @program: springboot_mybatis
 * @description: 用户数据访问
 * @author: Kaven
 * @create: 2018-11-18 16:20
 **/
//防止 UserController 报错，加一个 @Service
@Service
public interface UserDao {

    /**
     * 添加用户
     * */
    public int insert(UserDomin user);
}
