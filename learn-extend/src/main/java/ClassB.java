/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019-07-26
 * Time: 10:00
 * Description:
 */
public class ClassB extends ClassA{

    private ClassA a;

    void B(){
        System.out.println("Class B ,B");
    }

    public static void main(String[] args){
        new ClassB().test();
    }

}
