package com.rmaj91.behavioral.chainOfResponsibility;

public class Message {

    public String text;
    public Priority priority;

    public Message(String text, Priority priority) {
        this.text = text;
        this.priority = priority;
    }
}
