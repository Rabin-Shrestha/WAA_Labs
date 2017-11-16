package CoreJava;

public final class SingletonEagerInit {
    private static final SingletonEagerInit INSTANCE = new SingletonEagerInit();

    private SingletonEagerInit() {}

    public static SingletonEagerInit getInstance() {
        return INSTANCE;
    }
}