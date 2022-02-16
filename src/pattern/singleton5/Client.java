package pattern.singleton5;


public class Client {
    public static void main(String[] args) {
        singleon instance = singleon.INSTANCE;
        singleon instance1 = singleon.INSTANCE;
        System.out.println(instance == instance1);
    }
}
