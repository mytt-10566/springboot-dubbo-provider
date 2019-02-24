package com.momo.springbootdubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.momo.springbootdubboapi.UserService;
import com.momo.springbootdubboapi.po.User;
import org.springframework.stereotype.Component;

/**
 * @author Mo Qing Gen
 */
@Component
@Service(version = "1.0.0", timeout = 10000)
public class UserServiceImpl implements UserService {

    @Override
    public void sayHello(String name) {
        System.out.println(name + " say hello");
    }

    @Override
    public User findById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("小明");
        user.setGender(1);
        return user;
    }
}
