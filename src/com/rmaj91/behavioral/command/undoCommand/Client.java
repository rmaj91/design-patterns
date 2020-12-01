package com.rmaj91.behavioral.command.undoCommand;

public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        UnCountCommand unCountCommand = new UnCountCommand(receiver);
        CountCommand countCommand = new CountCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(countCommand);
        invoker.execute();
        invoker.execute();
        invoker.execute();
        invoker.setCommand(unCountCommand);
        invoker.execute();
    }
}
