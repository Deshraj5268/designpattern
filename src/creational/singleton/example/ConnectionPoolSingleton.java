package creational.singleton.example;

public enum ConnectionPoolSingleton {

    CONNECTION_POOL_SINGLETON;
    ConnectionPool connectionPool;

    ConnectionPoolSingleton(){
        connectionPool = new ConnectionPool();
        connectionPool.initialize();
    }

    public ConnectionPool getConnectionPool() {
        return connectionPool;
    }
}
