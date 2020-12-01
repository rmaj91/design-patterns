package com.rmaj91.behavioral.chainOfResponsibility;

public class Main {

    public static void main(String[] args) {
        Receiver faxErrorHandler = new FaxErrorHandler();
        Receiver emailErrorHandler = new EmailErrorHandler();

        IssueRaiser issueRaiser = new IssueRaiser();
        issueRaiser.setFirstErrorHandler(faxErrorHandler);
        faxErrorHandler.nextErrorHandler(emailErrorHandler);
        emailErrorHandler.nextErrorHandler(null);

        Message email = new Message("Email", Priority.LOW);
        Message fax = new Message("Fax", Priority.LOW);

        issueRaiser.raiseMessage(email);
        System.out.println("===================");
        issueRaiser.raiseMessage(fax);
    }
}
