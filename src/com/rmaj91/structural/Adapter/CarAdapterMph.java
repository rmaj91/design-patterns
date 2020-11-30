package com.rmaj91.structural.Adapter;

public class CarAdapterMph implements CarAdapter {

    Car car;

    public CarAdapterMph(Car car) {
        this.car = car;
    }

    @Override
    public double getSpeedMph() {
        return car.getSpeedKmh()*1.6;
    }
}
