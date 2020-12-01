package com.rmaj91.behavioral.command;

public class Main {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command undoCommand = new MyUndoCommand(receiver);
        Command redoCommand = new MyRedoCommand(receiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(undoCommand);
        invoker.invokeCommand();

        invoker.setCommand(redoCommand);
        invoker.invokeCommand();
    }
}
