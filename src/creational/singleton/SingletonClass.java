package creational.singleton;

import java.io.Serializable;

/*
* https://www.youtube.com/watch?v=upfrQvOgC24&list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&index=32
* synchronization double locking issues
* */
public class SingletonClass implements Cloneable,Serializable {

    static int i=0;
    private  static volatile  SingletonClass singletonClass; //changes visible to everywhere reordering issues and cache issue(L1 caching)

    // [ cpu order -  allocate memory , obj=memPointer , memPointer=initialization() can return dummy initialize object
    //-  allocate memory ,memPointer=initialization() , obj=memPointer//  ]
    private SingletonClass()throws Exception{
        if(singletonClass != null){
            throw new Exception("prevent from reflection ");
        }
        System.out.println("singleton object is being created "+i++);
    }

    public static SingletonClass getSingletonObject() throws Exception{
        if (singletonClass == null) {
            //double locking to prevent from multi threaded evm
            synchronized (SingletonClass.class) {//class level locking
                if (singletonClass == null) {
                    singletonClass = new SingletonClass(); // lazy loading
                    System.out.println("object is created ");
                }
            }
        }
        return singletonClass;
    }

    //to prevent from serialization while deserialization
    protected Object readResolve(){
        return singletonClass;
    }

    //prevent from cloning
    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Singleton cannot be cloned");
    }
}
