package de.training.blackbelt.generics;

import java.util.ArrayList;
import java.util.List;


public class Test3 {

    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
//        list.add("");

        List<? extends Number> list30 = new ArrayList<Integer>();
        List<? super Number> list40 = new ArrayList<Object>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("privet");
        list2.add("poka");
        showListInfo(list2);

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(summ(ald));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(3);
        ali.add(35);
        ali.add(30);
        System.out.println(summ(ali));
    }
    static void showListInfo(List<?> list){
        System.out.println("My list includes the following elements: " + list);
    }

    public static double summ(ArrayList<? extends Number> al){
        double summ=0;
        for(Number n : al) {
            summ += n.doubleValue();
        }
        return summ;
    }
}
