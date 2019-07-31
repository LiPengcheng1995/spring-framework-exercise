import java.lang.reflect.Field;

/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Date: 2019-07-26
 * Time: 09:59
 * Description:
 */
public class ClassA {

    void test() {
        Field field;

        try {
            field = this.getClass().getDeclaredField("a");
            if (field != null && field.getType().equals(ClassA.class)) {
                System.out.println(field.getClass().getName());
                field.setAccessible(true);
                field.set(this, new ClassA());
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("xxx");

    }

    void A() {
        System.out.println("Class A ,A");
        this.B();
    }

    void B() {
        System.out.println("Class A ,B");
    }
}
