package FactoryMethod;

/**
 * @Title咖啡店
 * @Time 2022年2月17日 12:21:10
 * @Author：yjh
 */
public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    public void setFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee OrderCoffee() {
       Coffee coffee = coffeeFactory.createCoffee();
       coffee.addMilk();
       coffee.addsugar();
        return coffee;
    }
}
