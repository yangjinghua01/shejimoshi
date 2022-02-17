package StaticFactory;

/**
 * @Title咖啡店
 * @Time 2022年2月17日 12:21:10
 * @Author：yjh
 */
public class CoffeeStore {
    public Coffee OrderCoffee(String type){
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
