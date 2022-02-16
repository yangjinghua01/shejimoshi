package pattern.singleton1;

public class Client {
    public static void main(String[] args) {
        Singletot instance = Singletot.getInstance();
        Singletot instance1 = Singletot.getInstance();
        System.out.println(instance == instance1);
    }
}
