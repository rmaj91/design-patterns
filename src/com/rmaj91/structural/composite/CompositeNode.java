package com.rmaj91.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeNode implements Node {

    private String name;
    private List<Node> nodes;

    public CompositeNode(String name) {
        this.name = name;
        this.nodes = new ArrayList<>();
    }

    @Override
    public String getNodeName() {
        return name + this.getClass().getName();
    }

    public void showNodesNames() {
        nodes.forEach(node -> System.out.println(node.getNodeName()));
    }

    public int getNodeCount() {
        return nodes.size();
    }

    public void addNode(Node node) {
        nodes.add(node);
    }
}
