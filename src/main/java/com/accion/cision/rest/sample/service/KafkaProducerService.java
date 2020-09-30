package com.accion.cision.rest.sample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducerService.class);
    private static final String TOPIC_NAME = "test";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMesage(String message) {
        LOGGER.info(String.format("Message sent -> %s", message));
        this.kafkaTemplate.send(TOPIC_NAME, message);
    }
}
