package com.rmaj91.behavioral.command.undoCommand;

public class CountCommand implements Command {

    private Receiver receiver;

    public CountCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.increase();
    }
}
