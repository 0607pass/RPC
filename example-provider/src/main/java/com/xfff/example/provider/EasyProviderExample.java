package com.xfff.example.provider;


import com.xfff.example.common.service.UserService;
import com.xfff.xrpc.registry.LocalRegistry;
import com.xfff.xrpc.server.HttpServer;
import com.xfff.xrpc.server.VertxHttpServer;

/**
 * 简易服务提供者示例
 */
public class EasyProviderExample {

    public static void main(String[] args) {
        //注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);
        // 提供服务
        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
