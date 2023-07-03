package org.fasttrackit.tema8.exercise3;

public class Mouse implements  AnimalBehavior{
    @Override
    public void walk() {
        System.out.println("mouse walk");
    }

    @Override
    public void talk() {
        System.out.println("mouse talk");
    }

    @Override
    public void eat() {
        System.out.println("mouse eat");
    }
}
