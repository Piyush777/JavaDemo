package org.ust.StructualDesignPattern.Decorator.TextFormatting;

public class TextFormattingDemo {

    public static void main(String[] args) {
        System.out.println("Text 1");
        Text text = new PlainText();
        System.out.println(text.format());

        text = new BoldText(text);
        System.out.println(text.format());

        text = new ItalicText(text);
        System.out.println(text.format());

        System.out.println("Text 2");
        Text text2 = new PlainText();
        System.out.println(text2.format());

        text2 = new ItalicText(text2);
        System.out.println(text2.format());

    }
}
