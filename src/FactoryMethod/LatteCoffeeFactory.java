package FactoryMethod;
/**
 * @Title拿铁咖啡工厂
 * @Time 2022年2月17日 12:21:10
 * @Author：yjh
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
