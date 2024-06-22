package controller;

import model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("chat.sendMessage")
    @SendTo("/topic/public")
    public Message sendMessage(
            @Payload Message message
    ){
        return message;
    }

    public Message addUser(
            @Payload Message message,
            SimpMessageHeaderAccessor headerAccessor
    ){
        headerAccessor.getSessionAttributes().put("username", message.getSender());
        return message;
    }
}
