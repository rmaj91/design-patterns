package com.rmaj91.behavioral.state.v2;

public class Main {

    public static void main(String[] args) {
        TV tv = new TV();
        tv.pressOffButton();
        tv.pressOnButton();
        tv.pressMuteButton();
        tv.pressOffButton();
        tv.pressMuteButton();
    }
}
