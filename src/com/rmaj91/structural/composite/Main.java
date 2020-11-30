package com.rmaj91.structural.composite;

public class Main {

    public static void main(String[] args) {
        CompositeNode compositeNode = new CompositeNode("compisite");

        Node stringNode = new StringNode("stringNode");
        Node numberNode = new NumberNode("numberNode");
        compositeNode.addNode(stringNode);
        compositeNode.addNode(numberNode);
        compositeNode.showNodesNames();
    }
}
