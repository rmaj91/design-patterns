package com.rmaj91.creational.builder.builderPattern;

public interface Builder {

    void addBrand();
    void addWheels();
    void addHeadLights();
    Product getProduct();
}
