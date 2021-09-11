package com.lipengcheng.learn.loader.resource;


import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Slf4j
public class LearnResourceLoad {
    public static void main(String[] args) {
        try {

            ClassLoader loader = LearnResourceLoad.class.getClassLoader();
            log.info(loader.getClass().getSimpleName());
            log.info("当前目录:{}", System.getProperty("user.dir"));

            InputStream stream = loader.getResourceAsStream("./niubi.txt");
            if (stream == null) {
                log.info("打开文件失败！");
                return;
            }

            StringBuffer buffer = new StringBuffer();
            BufferedReader in = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
            try {
                String temp;
                while (true) {
                    temp = in.readLine();
                    if (temp == null) {
                        break;
                    }
                    buffer.append(temp + "\r\n");
                }
            } catch (Throwable throwable) {
                log.error("读取异常！,", throwable);
            } finally {
                try {
                    stream.close();
                } catch (IOException e) {
                    log.error("关闭失败！,", e);
                }
            }
            log.info(">>>>>>");
            log.info(buffer.toString());
        } catch (Throwable throwable) {
            log.error("异常！！！！！", throwable);
        }
    }

}
