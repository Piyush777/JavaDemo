package org.ust.CreationDesignPattern.BuilderPattern.ComputerBuilder;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String operatingSystem;

    private Computer(Builder builder){
        this.CPU=builder.CPU;
        this.RAM=builder.RAM;
        this.storage=builder.storage;
        this.GPU =builder.GPU;
        this.operatingSystem=builder.operatingSystem;
    }

    public static class Builder{
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;
        private String operatingSystem;

        public Builder(String CPU, String RAM){
            this.CPU=CPU;
            this.RAM=RAM;
        }

        public Builder storage(String value){
            this.storage=value;
            return this;
        }

        public Builder GPU(String value){
            this.GPU=value;
            return this;
        }

        public Builder operatingSystem(String value){
            this.operatingSystem=value;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }


    }

    @Override
    public String toString(){
        return "Computer : CPU ="+CPU+" RAM="+RAM+
                " ,Storage = "+storage+" , GPU ="+GPU
                + " ,OS= "+ operatingSystem;
    }
}
