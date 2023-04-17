package com.example.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

//zookeeper 服务注册与发现
@Service //可以被扫描到，在项目中一启动自动注册到注册中心
@Component //使用dubbo尽量不要使用@Service，因为可能和Spring的注解重名
public class TicketServiceImpl implements TicketsService{
    @Override
    public String getTicket() {
        return "我是黄宏涛";
    }
}
