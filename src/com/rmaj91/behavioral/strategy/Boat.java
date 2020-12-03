package com.rmaj91.behavioral.strategy;

public class Boat extends Vehicle {

    public Boat() {
        transportMedium = new WaterTransport();
    }

    @Override
    public void showMe() {
        System.out.println("Im boat");
    }
}
