package com.rmaj91.behavioral.strategy;

public abstract class Vehicle {

    TransportMedium transportMedium;

    public void showTransportMedium() {
        transportMedium.transport();
    }

    public void commonJob() {
        System.out.println("Some common job");
    }

    public abstract void showMe();
}
