package sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

@SpringBootApplication
@EnableBinding(Sink.class)
public class UpperCaserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpperCaserApplication.class, args);
    }

    @ServiceActivator(inputChannel = Sink.INPUT)
    public void logMessage(String message) {
        System.out.println("received: '" + message + "'");
    }
}
