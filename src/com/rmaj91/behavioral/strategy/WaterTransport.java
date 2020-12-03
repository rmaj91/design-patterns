package com.rmaj91.behavioral.strategy;

public class WaterTransport implements TransportMedium {

    @Override
    public void transport() {
        System.out.println("Transporting through water");
    }
}
