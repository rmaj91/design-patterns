package com.rmaj91.creational.builder.builderPattern;

public class Product {

    private String brand;
    private String wheel;
    private String headLights;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public void setHeadLights(String headLights) {
        this.headLights = headLights;
    }

    @Override
    public String toString() {
        return "Product{" +
                "brand='" + brand + '\'' +
                ", wheel='" + wheel + '\'' +
                ", headLights='" + headLights + '\'' +
                '}';
    }
}
