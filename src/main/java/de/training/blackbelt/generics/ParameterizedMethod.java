package de.training.blackbelt.generics;

import java.util.ArrayList;


public class ParameterizedMethod {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(5);
        int i = GenMethod.getSecondElement(al1);
        System.out.println(i);

//        ArrayList<String> al2 = new ArrayList<>();
//        al2.add("abc");
//        al2.add("def");
//        al2.add("ghi");
//        String s = GenMethod.getSecondElement(al2);
//        System.out.println(s);
    }
}

class GenMethod{
    public static <T extends Number> T getSecondElement(ArrayList<T> a1){
        return a1.get(1);
    }
}