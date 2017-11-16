package CoreJava;

public final class Singleton_LazyInit {
    private static volatile Singleton_LazyInit instance = null;

    private Singleton_LazyInit() {}

    public static Singleton_LazyInit getInstance() {
        if (instance == null) {
            synchronized(Singleton_LazyInit.class) {
                if (instance == null) {
                    instance = new Singleton_LazyInit();
                }
            }
        }
        return instance;
    }
}