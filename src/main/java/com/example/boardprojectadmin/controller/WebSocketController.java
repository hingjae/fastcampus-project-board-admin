package com.example.boardprojectadmin.controller;

import com.example.boardprojectadmin.dto.websocket.WebSocketMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.security.Principal;

@Controller
public class WebSocketController {

    //principal은 시큐리티 인증정보를 담고 있는 객체
    @MessageMapping("/hello")
    @SendTo("/topic/chat")
    public WebSocketMessage chat(WebSocketMessage message, Principal principal) throws Exception {
        Thread.sleep(1000);

        return WebSocketMessage.of("안녕하세요 " + principal.getName() + "! " + message.content() + "라고 하셨나요?");
    }
}
