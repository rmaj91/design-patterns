package com.rmaj91.behavioral.observer;

public class Observer2 implements ObserverInterface {

    @Override
    public void update(int value) {
        System.out.println("Observer2 notify with: " + value);
    }

    @Override
    public void observe(Publisher publisher) {
        publisher.register(this);
    }
}
