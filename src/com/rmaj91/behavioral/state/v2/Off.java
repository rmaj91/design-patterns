package com.rmaj91.behavioral.state.v2;

public class Off implements PossibleState {

    private TV context;

    public Off(TV context) {
        this.context = context;
    }

    @Override
    public void pressOnButton() {
        System.out.println("You presses On button, going from OFF to ON state.");
        context.setCurrentState(context.getOnState());
    }

    @Override
    public void pressOffButton() {
        System.out.println("You presses Off button, you are already in off state.");
    }

    @Override
    public void pressMuteButton() {
        System.out.println("You presses Mute button, you cant mute off Tv");
    }

    @Override
    public String toString() {
        return "Tv is switched OFF now";
    }
}
