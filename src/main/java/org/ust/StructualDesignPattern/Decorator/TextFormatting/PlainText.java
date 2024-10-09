package org.ust.StructualDesignPattern.Decorator.TextFormatting;

//Concrete Component
public class PlainText implements Text{
    private String text;
    public PlainText(){
        this.text = "Plain Text";
    }

    @Override
    public String format() {
        return text;
    }
}
