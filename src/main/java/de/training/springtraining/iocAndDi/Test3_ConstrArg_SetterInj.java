package de.training.springtraining.iocAndDi;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test3_ConstrArg_SetterInj {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson",Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}
