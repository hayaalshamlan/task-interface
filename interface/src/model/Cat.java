package model;

import interfaces.AnimalInterface;

public class Cat implements AnimalInterface {
    public void eat() {
        System.out.println("cat eat tuna");
    }

    public void sleep() {
        System.out.println("cat sleeps anywhere");
    }

    public void makeSound() {
        System.out.println("cat sound meow");
    }

}
