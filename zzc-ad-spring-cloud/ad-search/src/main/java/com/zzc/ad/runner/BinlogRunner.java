package com.zzc.ad.runner;

import com.zzc.ad.mysql.BinlogClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Description: 〈实现CommandLineRunner接口，程序启动时加载。〉
 * 拓展：ApplicationContextAware接口的方式获取ApplicationContext对象实例,再通过可以用静态方法的方式获取spring容器中的bean
 * @Author: zzc
 */
@Slf4j
@Component
public class BinlogRunner implements CommandLineRunner {

    private final BinlogClient client;

    @Autowired
    public BinlogRunner(BinlogClient client) {
        this.client = client;
    }

    @Override
    public void run(String... strings) throws Exception {

        log.info("Coming in BinlogRunner...");
        client.connect();
    }
}
