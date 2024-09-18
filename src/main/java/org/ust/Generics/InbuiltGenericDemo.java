package org.ust.Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class InbuiltGenericDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(10);
        integerArrayList.add(120);
        int num = integerArrayList.get(0);
        System.out.println("First Number "+ num);

        Map<String,Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        int ageAlice = ageMap.get("Alice");
        System.out.println("Alice's Age "+ageAlice);


        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Alice");
        nameList.add("Charlie");
        nameList.add("Derik");
        nameList.add("Bob");

        Collections.sort(nameList);

        System.out.println("Sorted names "+ nameList);

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(-10);
        numList.add(-200);
        numList.add(300);
        numList.add(0);

        Collections.sort(numList);
        System.out.println("Sorted integers "+ numList);

    }
}
