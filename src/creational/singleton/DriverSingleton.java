package creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public class DriverSingleton {

    public static void main(String[] args) throws Exception {
        // basic testing
        SingletonClass singletonClass = SingletonClass.getSingletonObject();
        SingletonClass singletonClass1 = SingletonClass.getSingletonObject();

        System.out.println("singletonClass same instance? " + (singletonClass1 == singletonClass)); // true

        multiThreadEvmCase();
        SeriallizationCase(singletonClass);
        ReflectionCase();
        cloningCase(singletonClass);
        enumCaseHanding();
    }

    private static void enumCaseHanding() {
        // enum testing
        SingletonEnum s1=  SingletonEnum.SINGLETON_ENUM;
        SingletonEnum s2 = SingletonEnum.SINGLETON_ENUM;
        System.out.println("Enum same instance? " + (s1 == s2)); // true
    }

    private static void cloningCase(SingletonClass singletonClass) {
        // cloning case
        SingletonClass singletonCloneObj = null;
        try {
            singletonCloneObj = (SingletonClass) singletonClass.clone();
        }catch (Exception ex){
           // System.out.println(" cloning case ?");
            System.out.println(ex.getMessage());
        }
    }

    private static void ReflectionCase() throws NoSuchMethodException {
        //reflection
        Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonClass singletonClassReflection = null;
        try {
            singletonClassReflection = constructor.newInstance();
        }catch (Exception ex){
            System.out.println(ex.getCause());
        }
    }

    private static void SeriallizationCase(SingletonClass singletonClass) throws IOException, ClassNotFoundException {
        // Serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.obj"));
        oos.writeObject(singletonClass);
        oos.close();

        // Deserialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.obj"));
        SingletonClass singletonClass2 = (SingletonClass) ois.readObject();
        ois.close();

        System.out.println("Same instance after serialization? " + (singletonClass == singletonClass2));
    }

    private static void multiThreadEvmCase() {
        // multi thread testing
        Runnable task = ()->{
            SingletonClass singletonThread;
            try {
                singletonThread = SingletonClass.getSingletonObject();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" "+ singletonThread.hashCode());
        };
        System.out.println("singleton test in multi threaded environment : ");
        for(int i=0;i<10;i++){
            new Thread(task).start();
        }
    }
}
