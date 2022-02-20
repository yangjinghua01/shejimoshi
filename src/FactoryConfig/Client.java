package FactoryConfig;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.creatCoffee("american");
        System.out.println(coffee);
    }
}
