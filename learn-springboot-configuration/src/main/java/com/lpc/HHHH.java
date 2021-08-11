package com.lpc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: 李鹏程
 * @email: lipengcheng3@jd.com
 * @date: 2021/8/11
 * @Time: 20:19
 * @Description:
 */
@Slf4j
@Component
public class HHHH implements InitializingBean {
    @Value("${niubi.a}")
    private String hhh;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info(">>>>>>>>>>>,{}", hhh);
    }
}
