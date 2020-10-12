package com.accion.cision.rest.sample.controller;

import com.accion.cision.rest.sample.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping(value = "/kafka")
public class KafkaController {

//    private final KafkaProducerService kafkaProducerService;
//
//    @Autowired
//    public KafkaController(KafkaProducerService kafkaProducerService) {
//        this.kafkaProducerService = kafkaProducerService;
//    }
//
//    @GetMapping(value = "/publish")
//    public String sendMessageToKafkaTopic(@RequestParam ("message") String message) {
//        this.kafkaProducerService.sendMesage(message);
//        return "Message sent to the kafka topic";
//    }
}
