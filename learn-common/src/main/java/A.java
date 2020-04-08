import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Package: spring.framework.exercise.test
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019/11/13
 * Time: 17:46
 * Description:
 */
public class A implements Serializable {
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        for (int i=0;i<10;i++){
            x.add(i);
        }
        for (Integer a:x){
            x.remove(a);
        }
    }
}
