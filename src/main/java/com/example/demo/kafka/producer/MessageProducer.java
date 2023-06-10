package com.example.demo.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message){
        kafkaTemplate.send("demo-kafka-topic",message);
    }

}
