package org.ust.CreationDesignPattern.Factory.ConnectionFactory;

public class PostGreSQL implements Connection{


    @Override
    public void connect() {
        System.out.println("Connecting to PostGreSQL Database");
    }
}
