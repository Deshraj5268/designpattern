package creational.singleton.example;

public class ConnectionPoolDriver {

    public static void main(String[] args) {
        ConnectionPool connectionPool = ConnectionPoolSingleton.CONNECTION_POOL_SINGLETON.getConnectionPool();

        System.out.println(connectionPool.getUrl());
        System.out.println(connectionPool.getMaxConnection());
    }
}
