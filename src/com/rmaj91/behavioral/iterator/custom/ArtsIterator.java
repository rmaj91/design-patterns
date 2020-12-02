package com.rmaj91.behavioral.iterator.custom;

public class ArtsIterator implements Iterator {

    private String[] papers;
    private int position;

    public ArtsIterator(String[] papers) {
        this.papers = papers;
        position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return papers[position++];
    }

    @Override
    public String currentItem() {
        return papers[position];
    }

    @Override
    public boolean hasNext() {
        return position < papers.length;
    }
}
