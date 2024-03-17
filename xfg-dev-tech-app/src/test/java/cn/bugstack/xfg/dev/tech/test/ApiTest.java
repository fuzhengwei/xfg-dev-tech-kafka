package cn.bugstack.xfg.dev.tech.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.CountDownLatch;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTest {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    private String topicName = "test-001";

    @Test
    public void test_send() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            kafkaTemplate.send(topicName, "hello world");
            Thread.sleep(1500);
        }

        new CountDownLatch(1).await();
    }

}
