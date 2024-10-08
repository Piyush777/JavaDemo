package org.ust.StructualDesignPattern.Facade.ComputerFacade;

public class ComputerFacade {

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade(){
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive= new HardDrive();
    }

    public void start(){
        cpu.freeze();
        memory.load(0, hardDrive.read(0,1024));
        cpu.jump(0);
        cpu.execute();
    }
}
