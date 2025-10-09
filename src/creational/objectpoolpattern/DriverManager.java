package creational.objectpoolpattern;

import creational.objectpoolpattern.blockingqueue.DBConnPoolManagerBQueue;

public class DriverManager {

    public static void main(String[] args) throws InterruptedException {
       // objectPoolTest();
        objectPoolUsingBlockingQueueTest();
    }

    private static void objectPoolTest() {
        DBConnPoolManager dbConnPoolManager = DBConnPoolManager.getConnManagerInstance();
        MyDBConncetion [] pools = new MyDBConncetion[6];
        for (int i=0;i<pools.length;i++){
            pools[i] = dbConnPoolManager.getDBConnection();
        }

        MyDBConncetion myDBConncetion7 = dbConnPoolManager.getDBConnection();

        dbConnPoolManager.releaseConnection(pools[5]);
        MyDBConncetion myDBConncetion8 = dbConnPoolManager.getDBConnection();
    }

    private static void objectPoolUsingBlockingQueueTest() throws InterruptedException {
        System.out.println("using Blocking queue ......");
        DBConnPoolManagerBQueue dbConnPoolManager = DBConnPoolManagerBQueue.getConnManagerInstance();
        MyDBConncetion [] pools = new MyDBConncetion[2];
        for (int i=0;i<pools.length;i++){
            pools[i] = dbConnPoolManager.getDBConnection();
        }

        MyDBConncetion myDBConncetion7 = dbConnPoolManager.getDBConnection();

        dbConnPoolManager.releaseConnection(pools[1]);
        MyDBConncetion myDBConncetion8 = dbConnPoolManager.getDBConnection();
    }
}
