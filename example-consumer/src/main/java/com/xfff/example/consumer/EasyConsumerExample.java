package com.xfff.example.consumer;


import com.xfff.example.common.model.User;
import com.xfff.example.common.service.UserService;
import com.xfff.xrpc.proxy.ServiceProxyFactory;

/**
 * 简易服务消费者示例
 * @author 32500
 */
public class EasyConsumerExample {

    public static void main(String[] args) {
        // todo 需要获取 UserService 的实现类对象
        //静态代理
//        UserService userService = new UserServiceProxy();
        User user = new User();
        // 动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);

        user.setName("xfff");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
