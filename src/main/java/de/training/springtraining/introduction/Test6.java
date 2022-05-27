package de.training.springtraining.introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Pet cat = context.getBean("catBean",Pet.class);
        cat.say();

//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();

        context.close();
    }
}
