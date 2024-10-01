package org.ust.CreationDesignPattern.Factory.ShapeFactoryPackage;

public class ShapeFactory {

    public Shape getShape(String shapeType){
       /* if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else{
            return null;
        }
        */

        switch (shapeType.toLowerCase()){
            case "circle": return new Circle();
            case "rectangle": return new Rectangle();
            case "triangle": return new Triangle();
            default: return null;
        }
    }
}
