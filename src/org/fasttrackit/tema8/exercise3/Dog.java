package org.fasttrackit.tema8.exercise3;

public class Dog implements AnimalBehavior{
    @Override
    public void walk() {
        System.out.println("dog walk");
    }

    @Override
    public void talk() {
        System.out.println("dog talk");
    }

    @Override
    public void eat() {
        System.out.println("dog eat");
    }
}
