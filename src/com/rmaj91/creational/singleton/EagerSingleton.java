package com.rmaj91.creational.singleton;

public class EagerSingleton {

    private static final EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("Creating");
    }

    public static EagerSingleton create() {
        return eagerSingleton;
    }

    public static void dummyMethod() {
        System.out.println("Dummy method");
    }
}
