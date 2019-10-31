package spring.framework.exercise.test.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Package: spring.framework.exercise.test.pool
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019/10/31
 * Time: 21:05
 * Description:
 */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        TaskA a = new TaskA();

        executor.submit(a);
        System.out.println("123");
        System.out.println("123");
//        a.getClass().getDeclaredField("x").set(a, 2);
        a.setX(2);
        System.out.println("123");
        System.out.println("123");
        executor.shutdownNow();

    }
}
