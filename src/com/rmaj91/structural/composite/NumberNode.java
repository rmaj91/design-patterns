package com.rmaj91.structural.composite;

public class NumberNode implements Node {

    private String name;

    public NumberNode(String name) {
        this.name = name;
    }

    @Override
    public String getNodeName() {
        return name + this.getClass().getName();
    }
}
