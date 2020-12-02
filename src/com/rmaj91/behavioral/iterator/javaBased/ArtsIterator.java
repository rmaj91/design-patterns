package com.rmaj91.behavioral.iterator.javaBased;

import java.util.Iterator;

public class ArtsIterator implements Iterator<String> {

    private String[] papers;
    private int position;

    public ArtsIterator(String[] papers) {
        this.papers = papers;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position > papers.length;
    }

    @Override
    public String next() {
        return papers[position++];
    }

    public String currentItem() {
        return papers[position];
    }

    public void first() {
        position = 0;
    }
}
