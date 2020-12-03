package com.rmaj91.behavioral.state.v1;

public class Off implements PossibleState {

    @Override
    public void pressOnButton(Tv context) {
        System.out.println("You presses On button, going from OFF to ON state.");
        context.setCurrentState(new On());
    }

    @Override
    public void pressOffButton(Tv context) {
        System.out.println("You presses Off button, you are already in off state.");
    }

    @Override
    public void pressMuteButton(Tv context) {
        System.out.println("You presses Mute button, you cant mute off Tv");
    }

    @Override
    public String toString() {
        return "Tv is switched OFF now";
    }
}
