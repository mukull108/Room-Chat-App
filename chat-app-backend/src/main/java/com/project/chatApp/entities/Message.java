package com.project.chatApp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private String sender;
    private String content;
    private LocalDateTime dateTime;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
        this.dateTime=LocalDateTime.now();
    }
}