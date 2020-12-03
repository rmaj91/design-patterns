package com.rmaj91.behavioral.observer;

import java.util.LinkedList;
import java.util.List;

public class Publisher {

    private int flag;

    public void setFlag(int flag) {
        this.flag = flag;
        if (flag == 12 || flag == 54) {
            notifyRegisterObservers();
        }
    }

    private final List<ObserverInterface> observers = new LinkedList<>();

    void register(ObserverInterface observer) {
        observers.add(observer);
    }

    void unRegister(ObserverInterface observer) {
        observers.remove(observer);
    }

    void notifyRegisterObservers() {
        for (ObserverInterface observer : observers) {
            observer.update(flag);
        }
    }
}
