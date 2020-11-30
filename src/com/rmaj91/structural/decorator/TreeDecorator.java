package com.rmaj91.structural.decorator;

public class TreeDecorator implements ChristmasTree {

    private ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public void decorate() {
        christmasTree.decorate();
        System.out.println("decorating additional stuff");
    }

    public void turnOnLights() {
        System.out.println("Turning on lights");
    }
}
