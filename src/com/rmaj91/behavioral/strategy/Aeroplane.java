package com.rmaj91.behavioral.strategy;

public class Aeroplane extends Vehicle {

    public Aeroplane() {
        transportMedium = new AirTransport();
    }

    @Override
    public void showMe() {
        System.out.println("Im aeroplane");
    }
}
