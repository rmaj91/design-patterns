package com.rmaj91.behavioral.command;

public class Invoker {

    Command commandToBePerformed;

//    public Invoker(Command commandToBePerformed) {
//        this.commandToBePerformed = commandToBePerformed;
//    }

    public void setCommand(Command command) {
        this.commandToBePerformed = command;
    }

    public void invokeCommand() {
        commandToBePerformed.executeCommand();
    }
}
