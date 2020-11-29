package com.rmaj91.creational.builder.builderPattern;

public class Car implements Builder {

    private String brand;

    private Product product;

    public Car(String brand) {
        this.brand = brand;
        this.product = new Product();
    }

    @Override
    public void addBrand() {
        product.setBrand(brand);
    }

    @Override
    public void addWheels() {
        product.setWheel("4 wheels, ");
    }

    @Override
    public void addHeadLights() {
        product.setHeadLights("2 headlight, ");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
