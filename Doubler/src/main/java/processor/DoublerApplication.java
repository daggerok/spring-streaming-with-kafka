package processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.Transformer;

@Slf4j
@SpringBootApplication
@EnableBinding(Processor.class)
public class DoublerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoublerApplication.class, args);
    }

    @Transformer(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
    public String transform(String message) {

        log.info("doubling: {}", message);

        return message + message;
    }
}
