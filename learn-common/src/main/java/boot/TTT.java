package boot;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Package: boot
 * User: 李鹏程
 * Email: lipengcheng3@jd.com
 * Date: 2020/4/2
 * Time: 20:43
 * Description:
 */
@Data
@Lpc("haha")
@Lpc("hehe")
@Component("#{BusinessTypeEnum.JW_STRORE_ORDER}")
public class TTT implements InitializingBean, ApplicationContextAware,T {
    private List<Integer> jj=new ArrayList<>();

    @JSONField(serialize = false)
    private String orderWithCartXml="sdfaf";

    @Override
    public void afterPropertiesSet() throws Exception {
        jj.add(1);
        System.out.println(JSON.toJSONString(this));
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
