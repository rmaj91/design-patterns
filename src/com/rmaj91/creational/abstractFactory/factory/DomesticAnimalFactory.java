package com.rmaj91.creational.abstractFactory.factory;

import com.rmaj91.creational.abstractFactory.domain.Cat;
import com.rmaj91.creational.abstractFactory.domain.Dog;
import com.rmaj91.creational.abstractFactory.domain.DomesticCat;
import com.rmaj91.creational.abstractFactory.domain.DomesticDog;

public class DomesticAnimalFactory implements AnimalFactory {

    @Override
    public Dog createDog() {
        return new DomesticDog();
    }

    @Override
    public Cat createCat() {
        return new DomesticCat();
    }
}
