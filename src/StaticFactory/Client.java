package StaticFactory;

public class Client {
    public static void main(String[] args) {
//        创建咖啡店类
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.OrderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
