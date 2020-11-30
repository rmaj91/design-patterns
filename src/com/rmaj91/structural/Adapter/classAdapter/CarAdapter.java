package com.rmaj91.structural.Adapter.classAdapter;

public class CarAdapter extends EuCar {

    @Override
    double getSpeed() {
        return super.getSpeed()*1.6;
    }
}
