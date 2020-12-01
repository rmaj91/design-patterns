package com.rmaj91.behavioral.command.undoCommand;

public class Receiver {

    public int count = 0;

    public void increase() {
        System.out.println("count is now: " + ++count);
    }

    public void decrease() {
        System.out.println("count is now: " + --count);
    }
}
