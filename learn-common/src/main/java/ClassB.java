/**
 * Package: spring.framework.exercise.test
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019/10/31
 * Time: 11:29
 * Description:
 */
public class ClassB extends ClassA {
    public Integer x =100;

    public ClassB() {
        super();
        System.out.println("X1:"+x);
    }

    @Override
    public void doSth() {
        System.out.println("X2:"+x);
    }

    public static void main(String[] args){
        new ClassB();
    }
}
