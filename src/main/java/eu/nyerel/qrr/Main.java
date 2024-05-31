package eu.nyerel.qrr;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@Slf4j
@ApplicationScoped
public class Main {

    @Incoming("test-receive")
    public void receive(String message) {
        log.info("processing message {}", message);
    }

}
