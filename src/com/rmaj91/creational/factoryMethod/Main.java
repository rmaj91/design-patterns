package com.rmaj91.creational.factoryMethod;

public class Main {

    public static void main(String[] args) {
        BikeShop bikeShop = new BikeShop();
        TankShop tankShop = new TankShop();

        Vehicle bike = bikeShop.sellVehicle();
        Vehicle tank = tankShop.sellVehicle();

        System.out.println(bike);
        System.out.println(tank);
    }
}
