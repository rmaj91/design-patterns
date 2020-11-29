package com.rmaj91.creational.abstractFactory.factory;

import com.rmaj91.creational.abstractFactory.domain.Cat;
import com.rmaj91.creational.abstractFactory.domain.Dog;
import com.rmaj91.creational.abstractFactory.domain.WildCat;
import com.rmaj91.creational.abstractFactory.domain.WildDog;

public class WildAnimalFactory implements AnimalFactory {

    @Override
    public Dog createDog() {
        return new WildDog();
    }

    @Override
    public Cat createCat() {
        return new WildCat();
    }
}
