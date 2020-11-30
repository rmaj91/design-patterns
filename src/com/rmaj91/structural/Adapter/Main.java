package com.rmaj91.structural.Adapter;

public class Main {

    public static void main(String[] args) {
        EuCar euCar = new EuCar();
        CarAdapterMph carAdapterMph = new CarAdapterMph(euCar);
        double speedMph = carAdapterMph.getSpeedMph();
        System.out.println(speedMph);
    }
}
