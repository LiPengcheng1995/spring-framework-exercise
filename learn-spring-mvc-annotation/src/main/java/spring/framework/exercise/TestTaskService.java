package spring.framework.exercise;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2020/9/24
 * @Time: 22:05
 * @Description:
 */
@Service
@EnableScheduling
public class TestTaskService implements SchedulingConfigurer {


    private String SpringDynamicCronTask() {
        return "0/1 * * * * ?";
    }


    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.addTriggerTask(new Runnable() {
            @Override
            public void run() {
                // 任务逻辑
                try {
                    Thread.sleep(10000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("张三张三张三张三张三");
            }
        }, new Trigger() {
            @Override
            public Date nextExecutionTime(TriggerContext triggerContext) {
                String s = SpringDynamicCronTask();
                // 任务触发，可修改任务的执行周期
                CronTrigger trigger = new CronTrigger(s);
                Date nextExec = trigger.nextExecutionTime(triggerContext);
                return nextExec;
            }
        });


    }

}
