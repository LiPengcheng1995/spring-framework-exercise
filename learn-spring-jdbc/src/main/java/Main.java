import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Package: PACKAGE_NAME
 * User: 李鹏程
 * Date: 2019-07-31
 * Time: 20:41
 * Description:
 */
public class Main {
    public static final Integer THREAD_COUNT = 10;
    public volatile int count = THREAD_COUNT;
    public volatile long countOffSet;

    private static sun.misc.Unsafe U;


    public Main() {
        try {
            Field singleoneInstanceField = Unsafe.class.getDeclaredField("theUnsafe");
            singleoneInstanceField.setAccessible(true);
            U = (Unsafe) singleoneInstanceField.get(null);
            countOffSet = U.objectFieldOffset
                    (Main.class.getField("count"));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        UserTemplate userTemplate = ac.getBean("userTemplate", UserTemplate.class);
//        for(int i=0;i<20;i++){
//            List<User>res =  userTemplate.getByCreator("lipengcheng-0-0");
//            System.out.println(JSON.toJSONString(res));
//        }

        Main main = new Main();
        main.deal(userTemplate);

    }

    public void deal(UserTemplate userTemplate) throws InterruptedException {

        for (int i = 0; i < THREAD_COUNT; i++) {

            InsertTask task = new InsertTask();
            task.setUserTemplate(userTemplate);
            task.setI(i);

            task.run();
//            Thread thread = new Thread(task);
//            thread.setDaemon(true);
//            thread.start();
        }

        while (count != 0) {
            Thread.sleep(10000);
            System.out.println(">>>>>>>当前 count:" + count);
        }
    }

    public class InsertTask implements Runnable {

        private UserTemplate userTemplate;
        int i;

        @Override
        public void run() {
            for (int j = 0; j < 1000; j++) {
                User user = new User();
                user.setBusinessId((long) i);
                user.setCreator("lipengcheng-" + i + "-" + j);
                user.setModifier("lipengcheng-" + i + "-" + j);
                user.setTemplateId((long) j);
                user.setFormName("just a test,i=" + i + ",j=" + j);
                System.out.println("线程id:" + i + "次数:" + j + "插入之后生成的主键是：" + userTemplate.saveUser(user));
            }
            U.compareAndSwapInt(Main.this, countOffSet, count, count - 1);

        }

        public void setI(int i) {
            this.i = i;
        }

        public void setUserTemplate(UserTemplate userTemplate) {
            this.userTemplate = userTemplate;
        }
    }
}
