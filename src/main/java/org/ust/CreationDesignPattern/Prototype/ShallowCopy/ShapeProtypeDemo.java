package org.ust.CreationDesignPattern.Prototype.ShallowCopy;

public class ShapeProtypeDemo {

    public static void main(String[] args) {
        Shape original  = new Shape("Circle");
        Shape clonedShape = original.clone();
        System.out.println("Original Shape "+ original);
        System.out.println("Clone Shape "+ clonedShape);

        //Modify the clone shape
        clonedShape.setType("Square");
        System.out.println("After modification");
        System.out.println("Original Shape "+ original);
        System.out.println("Clone Shape "+ clonedShape);

    }
}
