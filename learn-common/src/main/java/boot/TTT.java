package boot;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Package: boot
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2020/4/2
 * Time: 20:43
 * Description:
 */
@Lpc("haha")
@Lpc("hehe")
@Component("#{BusinessTypeEnum.JW_STRORE_ORDER}")
public class TTT implements InitializingBean, ApplicationContextAware,T {
    @Value("${hehe}")
    private List<Integer> jj;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        String[] ids = applicationContext.getBeanNamesForType(T.class);
        for (int x=0;x<ids.length;x++){
            T t = applicationContext.getBean(ids[x],T.class);
            Lpc[] l = t.getClass().getAnnotationsByType(Lpc.class);
            System.out.println();

        }
        System.out.println();

    }
}
