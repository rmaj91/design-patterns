package com.rmaj91.behavioral.chainOfResponsibility;

public interface Receiver {

    boolean handleMessage(Message message);
    void nextErrorHandler(Receiver nextReceiver);
}
