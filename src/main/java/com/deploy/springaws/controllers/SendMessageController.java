package com.deploy.springaws.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/send-message")
public class SendMessageController {

    Logger logger = LoggerFactory.getLogger(SendMessageController.class.getName());

    @GetMapping
    public String sendMessage() {
        logger.info("Sending message...");
        return "My first deploy in AWS with Spring Boot!";
    }
}
