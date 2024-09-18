package org.ust.Generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedGeneric {

    public static void  addNumber(List<? super Integer> list){
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        addNumber(numbers);
        System.out.println("Number List");
        for(Number num: numbers){
            System.out.println(num);
        }

        System.out.println("Object List");
        List<Object> objectList = new ArrayList<>();
        addNumber(objectList);
        for(Object object: objectList){
            System.out.println(object);
        }
    }
}
