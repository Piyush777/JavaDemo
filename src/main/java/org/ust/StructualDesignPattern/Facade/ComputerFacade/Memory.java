package org.ust.StructualDesignPattern.Facade.ComputerFacade;

public class Memory {

    public void load(long position, String data){
        System.out.println("Memory: Loading data to position "+ position);
    }
}
