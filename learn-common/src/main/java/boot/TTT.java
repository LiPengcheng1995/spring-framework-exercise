package boot;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
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
@Component
public class TTT implements InitializingBean {
    @Value("${hehe}")
    private List<Integer> jj;

    @Override
    public void afterPropertiesSet() throws Exception {
System.out.println();
    }
}
