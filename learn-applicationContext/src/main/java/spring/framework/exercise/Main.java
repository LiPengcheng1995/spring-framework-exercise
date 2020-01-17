package spring.framework.exercise;

import net.sf.cglib.proxy.Enhancer;
import spring.framework.exercise.aop.CGLibCallback;
import spring.framework.exercise.domain.impl.school.ASchool;

/**
 * Package: spring.framework.exercise
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2020/1/17
 * Time: 17:24
 * Description:
 */
public class Main {
    public static void main(String args[]){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ASchool.class);
        enhancer.setCallback(new CGLibCallback());
        ASchool proxy = (ASchool) enhancer.create();
        proxy.getName();
    }
}
