package com.rmaj91.creational.abstractFactory.factory;

import com.rmaj91.creational.abstractFactory.domain.Cat;
import com.rmaj91.creational.abstractFactory.domain.Dog;

public interface AnimalFactory {

    Dog createDog();

    Cat createCat();
}
