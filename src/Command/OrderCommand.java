package Command;

import bridge.Mac;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Title 具体命令类    持有接受者对象
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class OrderCommand implements Command{
//    持有接收者对象
    private SeniorChef seniorChef;
//    持有订单类
    private Order order;

    public OrderCommand(SeniorChef seniorChef, Order order) {
        this.seniorChef = seniorChef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable()+"桌的订单：");
        Map<String,Integer> foodDIr = new HashMap<>();
        Set<String> keys = foodDIr.keySet();
        for ( String foodname : keys) {
            seniorChef.makeFood(foodname, foodDIr.get(foodname));
        }
        System.out.println(order.getDiningTable()+"桌的饭准备完毕！！！");
    }
}
