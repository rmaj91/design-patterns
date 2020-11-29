package com.rmaj91.creational.factoryMethod;

public class BikeShop {

    Vehicle sellVehicle() {
        return new Bike();
    }
}
