package org.ust.CreationDesignPattern.Factory.ShapeFactoryPackage;

import java.util.Objects;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        //circle object
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //rectangle object
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        //null
        Shape shape3= shapeFactory.getShape("SomeInvalidShape");
        if(Objects.isNull(shape3)){

            System.out.println("Factory returned null");
        }

        Shape shape4 = shapeFactory.getShape("TRIANGLE");
        shape4.draw();
    }
}
