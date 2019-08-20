package spring.framework.learn.populate.domain;

import org.springframework.beans.factory.InitializingBean;

/**
 * Package: spring.framework.learn.populate.domain
 * User: 李鹏程
 * Email: lipengcheng1995@gmail.com
 * Date: 2019-06-14
 * Time: 16:29
 * Description:
 */
public class A implements InitializingBean {
    private String field_a_1;
    private String field_a_2;
    private String field_a_3;
    private B b;

    public String getField_a_1() {
        return field_a_1;
    }

    public void setField_a_1(String field_a_1) {
        this.field_a_1 = field_a_1;
    }

    public String getField_a_2() {
        return field_a_2;
    }

    public void setField_a_2(String field_a_2) {
        this.field_a_2 = field_a_2;
    }

    public String getField_a_3() {
        return field_a_3;
    }

    public void setField_a_3(String field_a_3) {
        this.field_a_3 = field_a_3;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("正在调用 A 的 InitializingBean 的初始化钩子");
    }

    public void justInit() {
        System.out.println("这是随便的一个函数，用 xml 配置调用");
    }
}
