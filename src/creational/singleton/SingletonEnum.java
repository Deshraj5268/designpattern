package creational.singleton;

public enum SingletonEnum {

    // public static final SingletonEnum INSTANCE = new SingletonEnum(); // internally
    SINGLETON_ENUM; // private static

    public void test(){
        System.out.println("testing singleton using enum");
    }
}
