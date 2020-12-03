package com.rmaj91.behavioral.state.v2;

public class TV {

    private PossibleState currentState;
    private PossibleState onState;
    private PossibleState offState;
    private PossibleState muteState;

    public TV() {
        this.onState = new On(this);
        this.muteState = new Mute(this);
        this.offState = new Off(this);
        this.currentState = this.offState;
    }

    public PossibleState getCurrentState() {
        return currentState;
    }

    void setCurrentState(PossibleState state) {
        this.currentState = state;
    }

    public void pressOnButton() {
        currentState.pressOnButton();
    }

    public void pressOffButton() {
        currentState.pressOffButton();
    }

    public void pressMuteButton() {
        currentState.pressMuteButton();
    }

    public PossibleState getOnState() {
        return onState;
    }

    public PossibleState getOffState() {
        return offState;
    }

    public PossibleState getMuteState() {
        return muteState;
    }
}
