package com.rmaj91.creational.singleton;

public final class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static synchronized Singleton create() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public class awdd{

    }
}
