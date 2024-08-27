package org.ust.OOPS;

public class ClassDemo {
    //fields or attributes or properties
    private int field1;
    private String field2;

    //constructor
    public ClassDemo(int field1, String field2){

        this.field1=field1;
        this.field2=field2;
    }

    //setter method
    public void setField1(int value){
        //perform requisite operations
        field1=value;
    }

    //getter method
    public String getField2(){
        return field2;
    }

    public static void main(String[] args) {
        ClassDemo classDemo1 = new ClassDemo(1000,"UST");
        ClassDemo classDemo2 = new ClassDemo(2000,"IIHT");

        System.out.println(classDemo1);
        System.out.println(classDemo2);

        System.out.println(classDemo1.field1+" "+ classDemo1.field2);
        System.out.println(classDemo2.field1+" "+ classDemo2.field2);

        classDemo1.setField1(5000);
        classDemo2.setField1(8000);

        System.out.println("Using Getter and Setters");
        System.out.println(classDemo1.field1+" "+ classDemo1.getField2());
        System.out.println(classDemo2.field1+" "+ classDemo2.getField2());

    }
}


//Encapsulation
//Access Modifiers
//Inheritance and Polymorphism

