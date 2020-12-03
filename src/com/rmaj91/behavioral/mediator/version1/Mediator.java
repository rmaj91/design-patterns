package com.rmaj91.behavioral.mediator.version1;

public interface Mediator {

    void register(Employee employee);
    void sendMessage(Employee employee, String message) throws InterruptedException;

}
