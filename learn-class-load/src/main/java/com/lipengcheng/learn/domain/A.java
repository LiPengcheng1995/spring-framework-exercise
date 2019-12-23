package com.lipengcheng.learn.domain;

/**
 * Package: com.lipengcheng.learn.domain
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019/12/23
 * Time: 18:11
 * Description:
 */
public interface A {
    String a = Haha.get();
    interface B{
        String b1= a+"b1";
        String b2= a+"b2";
        String b3= a+"b3";
    }
}
