package sinple_factory;
/**
 * @Title咖啡店
 * @Time 2022年2月17日 12:21:10
 * @Author：yjh
 */
public class CoffeeStore {
    public Coffee OrderCoffee(String type){
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
//        调用生成咖啡的方法
        Coffee coffee = factory.createCoffee(type);
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
