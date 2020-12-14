package creational.singleton;

import java.io.Serializable;


public class SingletonClass implements Cloneable,Serializable {

    private volatile static SingletonClass singletonClass; //changes visible to everywhere

    private SingletonClass()throws Exception{
        if(singletonClass == null){
            new SingletonClass();
        }else{
            throw new Exception("prevent from reflection ");
        }
    }

    public static SingletonClass getSingletonObject() throws Exception{
        if (singletonClass == null) {
            //double locking to prevent from multi threaded evm
            synchronized (SingletonClass.class) {//class level locking
                if (singletonClass == null) {
                    singletonClass = new SingletonClass(); // lazy loading
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
        throw new CloneNotSupportedException();
    }
}
