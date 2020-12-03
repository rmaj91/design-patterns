package com.rmaj91.behavioral.observer;

public class Observer implements ObserverInterface {

    private String name;

    public Observer(String name) {
        this.name = name;
    }

    public void update(int value) {
        System.out.println(name + " notified with: " + value);
    }

    public void observe(Publisher publisher) {
        publisher.register(this);
    }
}
