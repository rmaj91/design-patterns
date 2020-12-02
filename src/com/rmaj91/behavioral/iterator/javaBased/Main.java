package com.rmaj91.behavioral.iterator.javaBased;

public class Main {

    public static void main(String[] args) {
        Arts arts = new Arts("jedno", "drugie", "trzecie");
        ArtsIterator iterator = arts.createIterator();

        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
    }
}
