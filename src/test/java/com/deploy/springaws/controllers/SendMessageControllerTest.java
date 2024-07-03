package com.deploy.springaws.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class SendMessageControllerTest {

    @InjectMocks
    private SendMessageController sendMessageController;

    private Logger logger;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        logger = mock(Logger.class);
        sendMessageController.logger = logger;
    }

    @Test
    public void sendMessageReturnExpectedString() {
        String expectedMessage = "My first deploy in AWS with Spring Boot!";
        String actualMessage = sendMessageController.sendMessage();

        verify(logger, times(1)).info("Sending message...");
        assertEquals(expectedMessage, actualMessage);
    }
}