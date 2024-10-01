package org.ust.CreationDesignPattern.Factory.ConnectionFactory;

public class ConnectionFactory {

    public Connection getConnection(String dbType){

        switch (dbType.toLowerCase()){
            case "mysql": return new MySQLConnection();
            case "postgresql": return new PostGreSQL();
            case "mongodb": return new MongoDBConnection();
            default: return null;
        }
    }
}
