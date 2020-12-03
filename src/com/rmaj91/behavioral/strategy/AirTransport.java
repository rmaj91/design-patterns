package com.rmaj91.behavioral.strategy;

public class AirTransport implements TransportMedium {

    @Override
    public void transport() {
        System.out.println("Transporting through air!");
    }
}
