package com.rmaj91.structural.composite;

public class StringNode implements Node {

    private String name;

    public StringNode(String name) {
        this.name = name;
    }

    @Override
    public String getNodeName() {
        return name + this.getClass().getName();
    }

}
