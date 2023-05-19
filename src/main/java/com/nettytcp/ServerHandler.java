package com.nettytcp;

import org.springframework.messaging.Message;

public class ServerHandler {

    public String handleRequest(Message<?> message) {
        byte[] payload = (byte[]) message.getPayload();
        String request = new String(payload);
        // Process the request and generate a response
        String response = "Hello, client! Your message was: " + request;
        return response;
    }
}