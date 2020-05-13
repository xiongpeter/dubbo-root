package com.xiongjun.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Testprovider {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "provider.xml" });
        context.start();
        System.out.println("提供者服务已注册成功");
        try {
            System.in.read();// 让此程序一直跑，表示一直提供服务
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
