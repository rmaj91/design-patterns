package com.rmaj91.creational.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {
        System.out.println("Creating");
    }

    public static BillPughSingleton create() {
        return BillPughSingletonHelper.billPughSingleton;
    }

    private static class BillPughSingletonHelper {
        private static final BillPughSingleton billPughSingleton = new BillPughSingleton();
    }

    public static void dummyMethod() {
        System.out.println("Dummy method");
    }
}
