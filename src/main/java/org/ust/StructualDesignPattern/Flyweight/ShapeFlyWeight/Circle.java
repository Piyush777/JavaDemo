package org.ust.StructualDesignPattern.Flyweight.ShapeFlyWeight;

//ConcreteFlyweight class
public class Circle implements Shape{
    private final String color;
    private static final int RADIUS=5;

    public Circle(String color){
        this.color = color;
    }


    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing Circle: Color = "+color+" , x= "+x+" ,y="+y+" , radius = "+ RADIUS);
    }
}
