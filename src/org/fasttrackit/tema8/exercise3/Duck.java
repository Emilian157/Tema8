package org.fasttrackit.tema8.exercise3;

public class Duck implements AnimalBehavior{
    @Override
    public void walk() {
        System.out.println("duck walk");
    }

    @Override
    public void talk() {
        System.out.println("duck talk");
    }

    @Override
    public void eat() {
        System.out.println("duck eat");
    }
}
