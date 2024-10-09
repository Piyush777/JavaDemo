package org.ust.StructualDesignPattern.Decorator.TextFormatting;

public class ItalicText extends TextDecorator{

    public ItalicText(Text text) {
        super(text);
    }

    public String format(){
        return super.format()+" , Italic";
    }
}
