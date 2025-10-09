package creational.objectpoolpattern;

import java.util.LinkedList;
import java.util.List;

public class DBConnPoolManager {

    private List<MyDBConncetion> freeConnPoolList;
    private List<MyDBConncetion> usedConnPoolList;
    private static final int MIN_POLL_SIZE = 3;
    private static final int MAX_POLL_SIZE = 6;

    private static volatile DBConnPoolManager dbConnPoolManagerInstance;

    private DBConnPoolManager(){
        freeConnPoolList = new LinkedList<>();
        usedConnPoolList = new LinkedList<>();

        for(int i=0;i<MIN_POLL_SIZE;i++){
            freeConnPoolList.add(new MyDBConncetion());
        }
    }

    public static DBConnPoolManager getConnManagerInstance(){
        if(dbConnPoolManagerInstance == null){
            synchronized (DBConnPoolManager.class){
                if (dbConnPoolManagerInstance == null){
                    dbConnPoolManagerInstance = new DBConnPoolManager();
                }
            }
        }
        return dbConnPoolManagerInstance;
    }

    public synchronized MyDBConncetion getDBConnection(){
        if(freeConnPoolList.isEmpty() && usedConnPoolList.size() < MAX_POLL_SIZE){
            freeConnPoolList.add(new MyDBConncetion());
        }else if (freeConnPoolList.isEmpty() && usedConnPoolList.size() >= MAX_POLL_SIZE){
            System.out.println("exceeding pool size : "+usedConnPoolList.size());
            return null;
        }

        System.out.print(" freeConnPoolList " +freeConnPoolList.size());
        MyDBConncetion MYDBConncetion = freeConnPoolList.remove(freeConnPoolList.size()-1);
        System.out.println(" getCOnnection : "+MYDBConncetion);
        usedConnPoolList.add(MYDBConncetion);
        System.out.println(" usedConnPoolList " + usedConnPoolList.size());
        return MYDBConncetion;
    }

    public synchronized boolean releaseConnection(MyDBConncetion myDBConncetion){
        if(myDBConncetion != null){
            if(!usedConnPoolList.isEmpty()){
                usedConnPoolList.remove(myDBConncetion);
                freeConnPoolList.add(myDBConncetion);
                System.out.println("released : "+myDBConncetion);
                return true;
            }
        }
        return false;
    }

}
