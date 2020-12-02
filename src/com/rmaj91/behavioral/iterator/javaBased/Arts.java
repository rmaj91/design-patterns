package com.rmaj91.behavioral.iterator.javaBased;

public class Arts implements Subjects {

    private String[] papers;

    public Arts(String... papers) {
        this.papers = papers;
    }

    public ArtsIterator createIterator() {
        return new ArtsIterator(papers);
    }
}
