package daggerok.messagesreceiver.sink;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

@Slf4j
@SpringBootApplication
@EnableBinding(Sink.class)
public class MessagesReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessagesReceiverApplication.class, args);
    }

    @ServiceActivator(inputChannel = Sink.INPUT)
    public void receiveMessage(String message) {
        log.info("message received: '{}'", message);
    }
}
