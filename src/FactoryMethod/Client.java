package FactoryMethod;

public class Client {
    public static void main(String[] args) {
//        创建咖啡店对象
        CoffeeStore store = new CoffeeStore();
//        创建对象
        CoffeeFactory factory = new AmericanCoffeeFactory();
//        点咖啡
        store.setFactory(factory);
        Coffee coffee = store.OrderCoffee();
        System.out.println(coffee.getName());
    }
}
