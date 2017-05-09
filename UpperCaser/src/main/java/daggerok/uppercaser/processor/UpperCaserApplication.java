package daggerok.uppercaser.processor;

import lombok.extern.slf4j.Slf4j;
import daggerok.api.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

@Slf4j
@SpringBootApplication
@EnableBinding(Processor.class)
public class UpperCaserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UpperCaserApplication.class, args);
    }

    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public Message toUpperCase(String message) {

        final Message result = new Message().setGreeting(message.toUpperCase());

        log.info("received: {}", result);
        return result;
    }
}
