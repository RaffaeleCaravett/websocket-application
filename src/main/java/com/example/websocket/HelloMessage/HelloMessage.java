package com.example.websocket.HelloMessage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloMessage {

    private String name;

    public HelloMessage() {
    }

    public HelloMessage(String name) {
        this.name = name;
    }

}
