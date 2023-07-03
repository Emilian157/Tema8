package org.fasttrackit.tema8.exercise3;

public class Cat implements AnimalBehavior{

    @Override
    public void walk() {
        System.out.println("cat walk");
    }

    @Override
    public void talk() {
        System.out.println("cat talk");
    }

    @Override
    public void eat() {
        System.out.println("cat eat");
    }
}
