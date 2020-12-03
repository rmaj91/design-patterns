package com.rmaj91.behavioral.state.v1;

public class Tv {

    private PossibleState currentState;

    public Tv() {
        this.currentState = new Off();
    }

    public PossibleState getCurrentState() {
        return currentState;
    }

    void setCurrentState(PossibleState state) {
        this.currentState = state;
    }

    public void pressOnButton() {
        currentState.pressOnButton(this);
    }

    public void pressOffButton() {
        currentState.pressOffButton(this);
    }

    public void pressMuteButton() {
        currentState.pressMuteButton(this);
    }
}
