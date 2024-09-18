package org.ust.Generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards {

    public static void printList(List<?> list){
        for(Object element: list){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);

        System.out.println("Print String List");
        printList(stringList);

        System.out.println("Print Int List");
        printList(integerList);
    }
}
