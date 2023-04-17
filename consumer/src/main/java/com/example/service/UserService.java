package com.example.service;


import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service //放到容器中，不要错用dubbo的@Service注解
public class UserService {

    //拿到provider-server提供的票,要去注册中心拿到服务
    @Reference//引用 ，Pom坐标或定义路径项目的接口名
    TicketsService ticketsService;

    public  void buyTicket(){
        String ticket = ticketsService.getTicket();
        System.out.println("在注册中心拿到票："+ticket);
    }
}
