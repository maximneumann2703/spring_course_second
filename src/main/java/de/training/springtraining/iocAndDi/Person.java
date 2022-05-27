package de.training.springtraining.iocAndDi;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    /*Person(Pet pet) {
        this.pet = pet;
    }*/
    public Person(){
        System.out.println("Person bean is created");
    }


    public void setPet(Pet pet) {
        this.pet = pet;
    }


    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        System.out.println("Class PErson: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }
}
