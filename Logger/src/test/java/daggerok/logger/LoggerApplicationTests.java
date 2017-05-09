package daggerok.logger;

import daggerok.logger.sink.LoggerApplication;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LoggerApplication.class)
public class LoggerApplicationTests {

    @Test @Ignore
    public void contextLoads() {}
}
