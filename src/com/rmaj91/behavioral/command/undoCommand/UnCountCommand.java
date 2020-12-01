package com.rmaj91.behavioral.command.undoCommand;

public class UnCountCommand implements Command{

    private Receiver receiver;

    public UnCountCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.decrease();
    }
}
