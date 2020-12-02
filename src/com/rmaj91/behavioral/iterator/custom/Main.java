package com.rmaj91.behavioral.iterator.custom;

public class Main {

    public static void main(String[] args) {
        Arts arts = new Arts("jajo", "kolo", "pila");
        Iterator iterator = arts.createIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        iterator.first();
        System.out.println(iterator.next());
        System.out.println(iterator.currentItem());
        System.out.println(iterator.currentItem());
        System.out.println(iterator.currentItem());
        System.out.println(iterator.hasNext());
    }
}
