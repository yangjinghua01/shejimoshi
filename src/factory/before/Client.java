package factory.before;

public class Client {
    public static void main(String[] args) {
//        创建咖啡店类
        CoffeeStore store = new CoffeeStore();
//        点咖啡
        Coffee coffee = store.OrderCoffee("latte");
        System.out.println(coffee.getName());

    }
}
