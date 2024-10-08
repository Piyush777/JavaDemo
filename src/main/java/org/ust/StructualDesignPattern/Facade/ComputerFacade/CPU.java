package org.ust.StructualDesignPattern.Facade.ComputerFacade;

public class CPU {

    public void freeze(){
        System.out.println("CPU: Freezing...");
    }

    public void jump(long position){
        System.out.println("CPU: Jumping onto position "+ position);
    }

    public void execute(){
        System.out.println("CPU: Executing...");
    }
}
