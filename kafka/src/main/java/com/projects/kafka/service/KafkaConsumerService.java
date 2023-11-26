package com.projects.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerService {

    @KafkaListener(topics = "test", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Received message in group 'my-group': " + message);
    }
}