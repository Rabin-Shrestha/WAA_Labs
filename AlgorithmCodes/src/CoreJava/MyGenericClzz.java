package CoreJava;

public class MyGenericClzz<T extends User> {
    private final Class<T> classType;

    public MyGenericClzz(Class<T> type) {
        this.classType = type;
    }

    public static void main(String[] args) {

        MyGenericClzz<SpecialUser> myGenericClazz = new MyGenericClzz<SpecialUser>(SpecialUser.class);
        System.out.println("A Generic class provided by compiler : " + myGenericClazz.getClass());// MyGenericClzz
        System.out.println("This is my actual type of generic clazz : " + myGenericClazz.getMyType()); // SpecialUser
    }

    public Class<T> getMyType() {
        return this.classType;
    }
}

class User {
}
class SpecialUser extends User {
}
