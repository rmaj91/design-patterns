package com.rmaj91.behavioral.chainOfResponsibility;

public class IssueRaiser {

    public Receiver firstReceiver;

    public void setFirstErrorHandler(Receiver firstErrorHandler) {
        this.firstReceiver = firstErrorHandler;
    }

    public void raiseMessage(Message message) {
        if (firstReceiver != null) {
            firstReceiver.handleMessage(message);
        }
    }
}
