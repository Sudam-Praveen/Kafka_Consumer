package edu.icet.crm.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConcumer {
    @KafkaListener(topics = "sample-topic",groupId = "my-group")// like api methods listen to this topic and group id
    public void listen(String message){
       log.info("Consumer Listener : {} ",message);
    }

}
