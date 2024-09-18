package org.ust.Generics;

public class GenericMethods {

    public static <T> void printArray(T[] inputArray){

        for(T element: inputArray){
            System.out.println(element);
        }
    }

    public static <T extends Number> double sum(T num1, T num2){
        return num1.doubleValue()+num2.doubleValue();
    }

    public static <T extends Comparable<T>> T getMax(T value1, T value2){
        if(value1.compareTo(value2)>0){
            return value1;
        }else{
            return value2;
        }
    }

    public static void main(String[] args) {

        Integer []intArray = {1,2,3,4,5};
        String  []strArray = {"A","B","C"};

        System.out.println("Integer Method ");
        printArray(intArray);
        System.out.println("String Method ");
        printArray(strArray);

        System.out.println("Adding two Integers");
        System.out.println(sum(10,20));

        System.out.println("Adding one Integer and one Float");
        System.out.println(sum(10,5.5));

        System.out.println("Adding two Floats");
        System.out.println(sum(3.6,5.5));

        //Invalid Operation
        //System.out.println(sum("10",5.5));

        System.out.println("Using GetMax with different data types");
        System.out.println(getMax(10,20));

        System.out.println(getMax("Apple", "Banana"));
    }
}
