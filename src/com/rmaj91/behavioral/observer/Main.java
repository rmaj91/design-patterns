package com.rmaj91.behavioral.observer;

public class Main {

    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        publisher.setFlag(44);
        ObserverInterface jacek = new Observer("Jacek");
        ObserverInterface kamil = new Observer2();
        ObserverInterface edyta = new Observer("Edyta");
        
        publisher.notifyRegisterObservers();
        System.out.println("===================");
        publisher.register(jacek);
        kamil.observe(publisher);
        publisher.setFlag(54);
        System.out.println("===================");
        publisher.unRegister(jacek);
        publisher.setFlag(12);
        System.out.println("===================");
        publisher.register(edyta);
        publisher.setFlag(54);
    }
}
