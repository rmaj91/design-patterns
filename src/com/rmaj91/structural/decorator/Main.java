package com.rmaj91.structural.decorator;

public class Main {

    public static void main(String[] args) {
        ChristmasTreeImpl christmasTree = new ChristmasTreeImpl();
        christmasTree.decorate();
        TreeDecorator treeDecorator = new TreeDecorator(christmasTree);
        treeDecorator.decorate();
        treeDecorator.turnOnLights();
    }
}
