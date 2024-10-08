package org.ust.StructualDesignPattern.Facade.ComputerFacade;

public class HardDrive {

    public String read(long startSector, int size){
        System.out.println("HardDrive: Reading "+ size+" bytes from sector "+ startSector);
        return "Some Data";
    }
}
