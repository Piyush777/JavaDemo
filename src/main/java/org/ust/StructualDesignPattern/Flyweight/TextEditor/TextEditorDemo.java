package org.ust.StructualDesignPattern.Flyweight.TextEditor;

public class TextEditorDemo {

    public static void main(String[] args) {
        String document = "Hello World";
        int x=0;
        int y=0;

        for(char c: document.toCharArray()){

            Glyph character = CharacterFactory.getCharacter(c);
            character.draw(x,y);
            x+=10;
        }
    }
}
