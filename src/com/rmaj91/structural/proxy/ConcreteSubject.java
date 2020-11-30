package com.rmaj91.structural.proxy;

public class ConcreteSubject extends Subject {

    @Override
    public void doSomeWork() {
        System.out.println("ConcreteSubject doing some work");
    }
}
