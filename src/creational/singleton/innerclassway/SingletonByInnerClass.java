package creational.singleton.innerclassway;


/*
*
* ✅ Advantages

Lazy Initialization → Instance is created only when getInstance() is called, not at class load.

Thread-Safe Without Synchronization → Uses Java class loading mechanism; the inner static class is loaded only once, ensuring thread safety without synchronized.

High Performance → No locking overhead compared to synchronized Singleton.

Simple & Clean Code → Easier to read and implement compared to double-checked locking.

Serialization Safety → If implemented carefully (by using readResolve), it can avoid multiple instances during deserialization.

❌ Drawbacks

Not Suitable for All Frameworks → Some dependency injection frameworks (like Spring) may prefer controlling Singleton creation themselves, making this pattern less flexible.

Reflection Vulnerability → Can still be broken using reflection unless you add explicit checks in the constructor.

Serialization Issue → Without readResolve(), deserialization can create a new instance.

Eager Class Loading in Some Cases → If the class containing the Singleton is referenced early, the inner class may be loaded sooner than expected.

Not as Explicit → Compared to Enum Singleton, it doesn’t inherently prevent multiple instances or protect from reflection as strongly.
* */
public class SingletonByInnerClass {

        // private constructor to prevent instantiation
        private SingletonByInnerClass() {
            // Protection against reflection
            if (Holder.INSTANCE != null) {
                throw new RuntimeException("Use getInstance() method to get the single instance");
            }
        }

        // Static inner class - loaded only when getInstance() is called
        private static class Holder {
            private static final SingletonByInnerClass INSTANCE = new SingletonByInnerClass();
        }

        // Global access point
        public static SingletonByInnerClass getInstance() {
            return Holder.INSTANCE;
        }

        // Optional: protect against deserialization creating a new instance
        protected Object readResolve() {
            return getInstance();
        }
}
