package org.ust.CreationDesignPattern.Factory.ConnectionFactory;

public class MySQLConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL Database");
    }
}
