package org.ust.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericIntro {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        String s = (String)list.get(0); //explicit type casting
        System.out.println(s);

        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        String s1 = list1.get(0); //no casting needed , thanks to geneircs
        System.out.println(s1);
    }
}
