package model;

import interfaces.AnimalInterface;

public class Dog implements AnimalInterface {
    public void eat() {
        System.out.println("dog eat dry food");
    }

    public void sleep() {
        System.out.println("dog sleep in comfortable place");
    }

    public void makeSound() {
        System.out.println("dogs bark");
    }

}
