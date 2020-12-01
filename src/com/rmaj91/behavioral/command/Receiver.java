package com.rmaj91.behavioral.command;

public class Receiver {

    public void performUndo() {
        System.out.println("Performing undo command in receiver...");
    }

    public void performRedo() {
        System.out.println("Performing redo command in receiver...");
    }

    public void doOptionalTaskPriorToUndo() {
        System.out.println("Executing -Optional Task undo command.");
    }

    public void doOptionalTaskPriorToRedo() {
        System.out.println("Executing -Optional Task redo command.");
    }
}
