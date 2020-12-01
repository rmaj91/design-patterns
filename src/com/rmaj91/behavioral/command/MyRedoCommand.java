package com.rmaj91.behavioral.command;

public class MyRedoCommand implements Command {

    private Receiver receiver;

    public MyRedoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executeCommand() {
        receiver.doOptionalTaskPriorToRedo();
        receiver.performRedo();
    }
}
