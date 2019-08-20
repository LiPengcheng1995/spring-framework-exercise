import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019-08-16
 * Time: 10:04
 * Description:
 */
public class TempMain {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i=0;i<3;i++){
            executorService.submit(()->{
                for (int j=0;j<5;j++){
                    System.out.println("循环一次");
                }
            });
        }
        executorService.shutdownNow();
        System.out.println("完成");
    }
}
