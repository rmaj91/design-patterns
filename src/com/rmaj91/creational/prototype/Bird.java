package com.rmaj91.creational.prototype;

public class Bird {

    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public Bird(Bird bird) {
        this.name = bird.name;
    }
}
