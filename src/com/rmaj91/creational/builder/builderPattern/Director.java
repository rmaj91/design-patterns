package com.rmaj91.creational.builder.builderPattern;

public class Director {

    public void construct(Builder builder) {
        builder.addBrand();
        builder.addWheels();
        builder.addHeadLights();
    }
}
