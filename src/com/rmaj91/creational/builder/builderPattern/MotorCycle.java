package com.rmaj91.creational.builder.builderPattern;

public class MotorCycle implements Builder {

    private String brand;

    private Product product;

    public MotorCycle(String brand) {
        this.brand = brand;
        this.product = new Product();
    }

    @Override
    public void addBrand() {
        product.setBrand(brand);
    }

    @Override
    public void addWheels() {
        product.setWheel("2 wheels, ");
    }

    @Override
    public void addHeadLights() {
        product.setHeadLights("1 headlight, ");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
