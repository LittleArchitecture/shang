package com.shang.sys;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author NICK
 * @date 2017-12-09 20:54
 **/
public class Main {

    public static void main(String[] args) throws IOException {

        // dubbo默认启动方式
        com.alibaba.dubbo.container.Main.main(args);

        // spirng 启动方式
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
//        System.out.println(context.getDisplayName() + ": here");
//        context.start();
//        System.out.println("服务已经启动...");
//        System.in.read();

    }

}
