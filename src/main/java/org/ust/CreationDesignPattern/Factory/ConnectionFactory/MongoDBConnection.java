package org.ust.CreationDesignPattern.Factory.ConnectionFactory;

public class MongoDBConnection implements Connection{

    @Override
    public void connect() {
        System.out.println("Connection to Mongo Database ");
    }
}
