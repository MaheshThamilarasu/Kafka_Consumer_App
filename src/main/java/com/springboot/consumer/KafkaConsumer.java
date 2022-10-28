package com.springboot.consumer;


import com.springboot.kafka.kafka.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "hellotopic", containerFactory = "kafkaListenerContainerFactory")
    public void listen(Message message){
        System.out.println("Message Received::::" + message.toString());
    }
}
