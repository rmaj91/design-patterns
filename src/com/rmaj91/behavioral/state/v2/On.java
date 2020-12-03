package com.rmaj91.behavioral.state.v2;

public class On  implements PossibleState {

    private TV context;

    public On(TV context) {
        this.context = context;
    }

    @Override
    public void pressOnButton() {
        System.out.println("You presses On button, you are already in ON state.");
    }

    @Override
    public void pressOffButton() {
        System.out.println("You presses Off button, going to off state.");
        context.setCurrentState(context.getOffState());
    }

    @Override
    public void pressMuteButton() {
        System.out.println("You presses Mute button, going to MUTE state.");
    }

    @Override
    public String toString() {
        return "TV is switched ON now";
    }
}
