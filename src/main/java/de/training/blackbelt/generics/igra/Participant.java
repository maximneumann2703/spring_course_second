package de.training.blackbelt.generics.igra;

public abstract class Participant {

    private String name;
    private int age;

    public Participant(final String name, final int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
