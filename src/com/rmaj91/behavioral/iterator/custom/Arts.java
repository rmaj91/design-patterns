package com.rmaj91.behavioral.iterator.custom;

public class Arts implements Subjects {

    private String[] papers;

    public Arts(String... papers) {
        this.papers = papers;
    }

    public Iterator createIterator() {
        return new ArtsIterator(papers);
    }
}
