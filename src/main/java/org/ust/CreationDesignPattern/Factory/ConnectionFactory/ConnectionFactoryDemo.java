package org.ust.CreationDesignPattern.Factory.ConnectionFactory;

import java.util.Objects;

public class ConnectionFactoryDemo {

    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection1 = connectionFactory.getConnection("MYSQL");
        connection1.connect();
        Connection connection2 = connectionFactory.getConnection("POSTGRESQL");
        connection2.connect();
        Connection connection3 = connectionFactory.getConnection("SOME RANDOM");
        if(Objects.isNull(connection3)){
            System.out.println("Null response from factory");
        }
        Connection connection4= connectionFactory.getConnection("MONGODB");
        connection4.connect();

    }
}
