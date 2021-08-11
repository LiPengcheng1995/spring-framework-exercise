package com.lpc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Package: com.lpc.learn.dubbo
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2020/5/27
 * Time: 18:30
 * Description:
 * @date 2020-05-27 19:47
 * @author lipengcheng3
 */
@Slf4j
@SpringBootApplication
public class SpringProviderMain {
    public static void main(String[] args) {
        SpringApplication.run(SpringProviderMain.class, args);
//        try {
//            System.in.read();
//        } catch (Throwable e) {
//            log.error("收到退出消息,",e);
//        }
    }
}