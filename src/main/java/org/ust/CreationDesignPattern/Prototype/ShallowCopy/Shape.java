package org.ust.CreationDesignPattern.Prototype.ShallowCopy;

public class Shape implements Prototype{

    private String type;
    public Shape(String type){
        this.type=type;
    }
    @Override
    public Shape clone() {
        return new Shape(this.type);
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    @Override
    public String toString(){
        return "Shape type:"+type;
    }

}
