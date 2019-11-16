package com.lanc4r.phoenix;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhoenixApplicationTests {

    private static Logger monitorLog = LoggerFactory.getLogger(PhoenixApplicationTests.class);

    @Test
    public void contextLoads() {
        monitorLog.debug("啦啦啦");
        monitorLog.warn("啦啦啦");
        monitorLog.info("啦啦啦");
        monitorLog.error("啦啦啦");
    }

}
