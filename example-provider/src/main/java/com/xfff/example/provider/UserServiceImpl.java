package com.xfff.example.provider;


import com.xfff.example.common.model.User;
import com.xfff.example.common.service.UserService;

/**
 * 用户服务实现类
 * @author 32500
 */
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
