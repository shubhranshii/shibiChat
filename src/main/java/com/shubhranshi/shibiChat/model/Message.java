package com.shubhranshi.shibiChat.model;

import com.shubhranshi.shibiChat.MessageType;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {
    private String content;
    private String sender;
    private String receiver;
    //private String timestamp;
    private MessageType type;
}
