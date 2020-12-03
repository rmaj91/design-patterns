package com.rmaj91.behavioral.mediator.version2;

public interface Mediator {

    void register(Employee employee);
    void sendMessage(Employee from, Employee to, String message) throws InterruptedException;

}
