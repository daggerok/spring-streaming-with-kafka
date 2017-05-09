package daggerok.greater.source;

import daggerok.api.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

@Slf4j
@SpringBootApplication
@EnableBinding(Source.class)
public class GreaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreaterApplication.class, args);
    }

    @InboundChannelAdapter(Source.OUTPUT)
    public Message currentTimeInMillis() {

        final Message greeting = new Message().setGreeting("current time is: " + System.currentTimeMillis());

        log.info("producing: {}", greeting);
        return greeting;
    }
}
