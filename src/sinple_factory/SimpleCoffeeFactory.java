package sinple_factory;
/**
 * @Title咖啡工厂
 * @Time 2022年2月17日 18:09:32
 * @Author：yjh
 */
public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type){
        Coffee coffee = null;
        if ("american".equals(type)){
            coffee= new AmericanCoffee();
        }else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }
        return coffee;
    }
}
