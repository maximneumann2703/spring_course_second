package de.training.blackbelt.generics;

import java.util.ArrayList;
import java.util.List;


public class Test1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("srtghtfe");

        for(Object o : list) {
            System.out.println(o + " length:"+ ((String)o).length());
        }

    }
}
