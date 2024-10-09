package org.ust.StructualDesignPattern.Decorator.TextFormatting;


//Concrete Decorator
public class BoldText extends TextDecorator {
    public BoldText(Text text) {
        super(text);
    }

    public String format(){
        return super.format()+" , Bold";
    }
}
