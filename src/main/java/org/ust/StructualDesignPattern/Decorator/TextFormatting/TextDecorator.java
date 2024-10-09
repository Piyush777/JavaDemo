package org.ust.StructualDesignPattern.Decorator.TextFormatting;

//Decorator
public class TextDecorator implements Text{

    protected Text decoratedText;

    public TextDecorator(Text text){
        this.decoratedText = text;
    }

    public String format(){
        return decoratedText.format();
    }
}
