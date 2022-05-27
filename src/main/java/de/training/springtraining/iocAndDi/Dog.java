package de.training.springtraining.iocAndDi;

public class Dog implements Pet {

//    private String name;

//    public String getName() {
//        return name;
//    }

//    public void setName(final String name) {
//        this.name = name;
//    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

    private void init() {
        System.out.println("Class Dog: init method");
    }

    private void destroy() {
        System.out.println("Class Dog: destroy method");
    }

}
