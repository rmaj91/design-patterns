package com.rmaj91.creational.abstractFactory;

import com.rmaj91.creational.abstractFactory.domain.Animal;
import com.rmaj91.creational.abstractFactory.domain.Cat;
import com.rmaj91.creational.abstractFactory.domain.Dog;
import com.rmaj91.creational.abstractFactory.factory.AnimalFactory;
import com.rmaj91.creational.abstractFactory.factory.DomesticAnimalFactory;
import com.rmaj91.creational.abstractFactory.factory.WildAnimalFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AnimalFactory animalFactory;
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        if ("domestic".equals(command)) {
            animalFactory = new DomesticAnimalFactory();
        } else if ("wild".equals(command)) {
            animalFactory = new WildAnimalFactory();
        } else {
            return;
        }
        Animal dog = animalFactory.createDog();
        Animal cat = animalFactory.createCat();
        System.out.println("Cat: " + cat);
        System.out.println("Dog: " + dog);
    }
}
