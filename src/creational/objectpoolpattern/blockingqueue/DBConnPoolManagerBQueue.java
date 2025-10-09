package creational.objectpoolpattern.blockingqueue;

import creational.objectpoolpattern.DBConnPoolManager;
import creational.objectpoolpattern.MyDBConncetion;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class DBConnPoolManagerBQueue {

    private BlockingDeque<MyDBConncetion> blockingQueue;
    private static final int MIN_POLL_SIZE = 3;
    private static final int MAX_POLL_SIZE = 6;

    private static volatile DBConnPoolManagerBQueue dbConnPoolManagerInstance;

    private DBConnPoolManagerBQueue(){
        blockingQueue = new LinkedBlockingDeque<>(MAX_POLL_SIZE);
        for(int i=0;i<MIN_POLL_SIZE;i++){
            blockingQueue.offer(new MyDBConncetion());
        }
    }

    public static DBConnPoolManagerBQueue getConnManagerInstance(){
        if(dbConnPoolManagerInstance == null){
            synchronized (DBConnPoolManager.class){
                if (dbConnPoolManagerInstance == null){
                    dbConnPoolManagerInstance = new DBConnPoolManagerBQueue();
                }
            }
        }
        return dbConnPoolManagerInstance;
    }

    public MyDBConncetion getDBConnection() throws InterruptedException {
        MyDBConncetion myDBConncetion =  blockingQueue.take();
        System.out.println("getDBConnection() : "+myDBConncetion);
        return myDBConncetion;
    }

    public synchronized boolean releaseConnection(MyDBConncetion myDBConncetion){
        if(myDBConncetion != null){
            blockingQueue.offer(myDBConncetion);
                System.out.println("released : "+myDBConncetion);
                return true;
            }
        return false;
    }

}
