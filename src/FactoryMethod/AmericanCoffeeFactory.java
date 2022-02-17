package FactoryMethod;
/**
 * @Title美式咖啡工厂专门用来生产美式咖啡
 * @Time 2022年2月17日 12:21:10
 * @Author：yjh
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
