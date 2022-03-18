package visitor;

public class CLlent {
    public static void main(String[] args) {
        Home home = new Home();
//        添加元素
        home.add(new Cat());
        home.add(new Dog());
        Ower ower = new Ower();
        home.action(ower);
    }
}
