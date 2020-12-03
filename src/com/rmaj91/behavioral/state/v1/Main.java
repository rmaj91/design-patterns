package com.rmaj91.behavioral.state.v1;

public class Main {

    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.pressOnButton();
        tv.pressOnButton();
        tv.pressMuteButton();
        tv.pressOffButton();
        tv.pressOffButton();
        tv.pressMuteButton();
    }
}
