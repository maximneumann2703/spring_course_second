package de.training.springtraining.iocAndDi;

public class Cat implements Pet{

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
