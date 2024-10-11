package org.ust.StructualDesignPattern.Flyweight.ShapeFlyWeight;

//Client
public class ShapeFactoryDemo {
    public static void main(String[] args) {
        ShapeFactory.getCircle("Red").draw(10,20);
        ShapeFactory.getCircle("Green").draw(30,40);
        ShapeFactory.getCircle("Blue").draw(50,60);
        ShapeFactory.getCircle("Red").draw(70,80);
        ShapeFactory.getCircle("Green").draw(90,100);
    }
}
