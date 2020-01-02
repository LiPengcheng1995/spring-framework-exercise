/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2020/1/2
 * Time: 12:00
 * Description: 评审代码时突然有个问题，就是try里面跑出来的如果第一个catch住了，新抛出来的会不会继续被catch
 * 写了一下，证明不会
 */
public class MainCatch {
    public static void main(String[] args) throws Exception {
        try {
            throw new RuntimeException();
        }catch (RuntimeException e){
            System.out.println("RuntimeException");
            throw new Exception();
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
