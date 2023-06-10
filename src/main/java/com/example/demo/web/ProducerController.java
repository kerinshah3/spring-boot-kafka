package com.example.demo.web;

import com.example.demo.kafka.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    MessageProducer messageProducer;

    @PostMapping("/sendMessage")
    public ResponseEntity<String> sendMessage(@RequestParam("message") String message){
        messageProducer.sendMessage(message);
        return ResponseEntity.ok("Message Sent");
    }

}
