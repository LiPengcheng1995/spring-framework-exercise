package pool;

/**
 * Package: pool
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2019/10/31
 * Time: 21:04
 * Description:
 */
public class TaskA implements Runnable {
    Integer x = 1;
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("x="+x);
            if (x==1){
                continue;
            }
            if (x == 2){
                break;
            }
        }
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }
}
