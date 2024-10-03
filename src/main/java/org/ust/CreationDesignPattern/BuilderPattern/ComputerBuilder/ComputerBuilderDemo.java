package org.ust.CreationDesignPattern.BuilderPattern.ComputerBuilder;

public class ComputerBuilderDemo {

    public static void main(String[] args) {

        Computer computerBasic = new Computer.Builder("Intel i5","16GB")
                                .build();
        System.out.println(computerBasic);

        Computer advancedComputer = new Computer.Builder("Intel i7", "32GB")
                .storage("512GB SSD")
                .operatingSystem("Windows 10")
                .build();
        System.out.println(advancedComputer);

        Computer gamingComputer = new Computer.Builder("Intel i7", "64GB")
                .storage("1024GB SSD")
                .GPU("NVIDIA RTX 4090")
                .operatingSystem("Windows 11")
                .build();
        System.out.println(gamingComputer);
    }
}
