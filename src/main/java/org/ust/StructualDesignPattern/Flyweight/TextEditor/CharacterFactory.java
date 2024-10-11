package org.ust.StructualDesignPattern.Flyweight.TextEditor;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CharacterFactory {
    private static final Map<Character, Glyph> charMap = new HashMap<>();

    public static Glyph getCharacter(char symbol){
        Glyph character = charMap.get(symbol);
        if(Objects.isNull(character)){
            character = new CharacterConreteFlyWeight(symbol);
            charMap.put(symbol,character);
            System.out.println("Creating character :"+ symbol);
        }
        return character;
    }
}
