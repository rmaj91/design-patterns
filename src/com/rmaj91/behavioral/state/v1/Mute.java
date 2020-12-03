package com.rmaj91.behavioral.state.v1;

public class Mute implements PossibleState {

    @Override
    public void pressOnButton(Tv context) {
        System.out.println("You presses On button, noting changed");
    }

    @Override
    public void pressOffButton(Tv context) {
        System.out.println("You presses Off button, going to off state.");
        context.setCurrentState(new Off());
    }

    @Override
    public void pressMuteButton(Tv context) {
        System.out.println("You presses Mute button, you already in mute state.");
    }

    @Override
    public String toString() {
        return "Tv is MUTED now";
    }
}
