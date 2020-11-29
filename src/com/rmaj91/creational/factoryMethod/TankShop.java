package com.rmaj91.creational.factoryMethod;

public class TankShop extends BikeShop {

    @Override
    Vehicle sellVehicle() {
        return new Tank();
    }
}
