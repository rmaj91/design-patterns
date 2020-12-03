package com.rmaj91.behavioral.state.v2;

public class Mute implements PossibleState{

    private TV context;

    public Mute(TV context) {
        this.context = context;
    }

    @Override
    public void pressOnButton() {
        System.out.println("You presses On button, noting changed");
    }

    @Override
    public void pressOffButton() {
        System.out.println("You presses Off button, going to off state.");
        context.setCurrentState(context.getOffState());
    }

    @Override
    public void pressMuteButton() {
        System.out.println("You presses Mute button, you already in mute state.");
    }

    @Override
    public String toString() {
        return "Tv is MUTED now";
    }
}
