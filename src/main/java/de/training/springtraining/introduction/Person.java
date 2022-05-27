package de.training.springtraining.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
//    @Value("${person.surname}")
    private String surname;
//    @Value("${person.age}")
    private int age;

//    @Autowired
     Person(/*@Qualifier("catBean") */Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }
       public Person(){
        System.out.println("Person bean is created");
    }

//    @Autowired
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
