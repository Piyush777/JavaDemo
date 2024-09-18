package org.ust.Generics;
import java.util.*;

public class UpperBoundedWildcard {

    public static double sumList(List<? extends Number> list){
        double sum=0;
        for(Number number: list){
            sum+=number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.2);
        doubleList.add(20.4);
        doubleList.add(30.9);

        System.out.println("Sum of Integer List "+ sumList(integerList));

        System.out.println("Sum of Double List "+ sumList(doubleList));
    }
}
