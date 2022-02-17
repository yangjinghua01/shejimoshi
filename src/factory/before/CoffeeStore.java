package factory.before;
/**
 * @Title咖啡店
 * @Time 2022年2月17日 12:21:10
 * @Author：yjh
 */
public class CoffeeStore {
    public Coffee OrderCoffee(String type){
//        声明Coffee类型的变量，根据不同类型创建不同的Coffee子类对象
        Coffee coffee = null;
        if ("american".equals(type)){
            coffee= new AmericanCoffee();
        }else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
