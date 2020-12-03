package com.rmaj91.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        Vehicle aeroplane = new Aeroplane();
        Vehicle boat = new Boat();

        aeroplane.showMe();
        aeroplane.showTransportMedium();

        boat.showMe();
        boat.showTransportMedium();
    }
}
