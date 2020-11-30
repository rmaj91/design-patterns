package com.rmaj91.structural.proxy;

public class Proxy extends Subject {

    static Subject subject;

    @Override
    public void doSomeWork() {
        if (subject == null) {
            subject= new ConcreteSubject();
        }
        subject.doSomeWork();
    }
}
