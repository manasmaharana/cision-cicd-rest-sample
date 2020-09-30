package com.accion.cision.rest.sample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerService.class);
    private static final String TOPIC_NAME = "test";
    private static final String GROUP_ID = "group_id";

    @KafkaListener(topics = TOPIC_NAME, groupId = GROUP_ID)
    public void consume(String message) {
        LOGGER.info(String.format("Message received -> %s", message));
    }
}
