import com.alibaba.fastjson.JSON;

import java.io.*;

/**
 * Package: spring.framework.exercise
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019/11/13
 * Time: 17:45
 * Description:
 */
public class MainSerialA {

    //序列化过程
    public static void toSerialA() {
        try {
            A a = new A();
            a.setA("哈哈哈哈");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("user.txt"));
            objectOutputStream.writeObject(a);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //反序列化过程
    public static void fromSerialA() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.txt"));
            A a = (A) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(JSON.toJSONString(a));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        toSerialA();
        fromSerialA();
    }


}
