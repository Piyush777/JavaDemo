package org.ust.StructualDesignPattern.Flyweight.TextEditor;

public class CharacterConreteFlyWeight implements Glyph{

    private final char symbol;

    public CharacterConreteFlyWeight(char symbol){
        this.symbol = symbol;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing "+symbol+" at x= "+x+" y= "+y);
    }
}
