package org.fasttrackit.tema8.exercise3;

public class Chicken implements AnimalBehavior{
    @Override
    public void walk() {
        System.out.println("chicken walk");
    }

    @Override
    public void talk() {
        System.out.println("chicken talk");
    }

    @Override
    public void eat() {
        System.out.println("chicken eat");
    }
}
