package com.rmaj91.behavioral.state.v1;

public class On implements PossibleState {

    @Override
    public void pressOnButton(Tv context) {
        System.out.println("You presses On button, you are already in ON state.");
    }

    @Override
    public void pressOffButton(Tv context) {
        System.out.println("You presses Off button, going to off state.");
        context.setCurrentState(new Off());
    }

    @Override
    public void pressMuteButton(Tv context) {
        System.out.println("You presses Mute button, going to MUTE state.");
    }

    @Override
    public String toString() {
        return "Tv is switched ON now";
    }
}
