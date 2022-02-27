package Proxy.static_proxy;

/**
 * @Title 代售点类
 * @Time 2022年2月20日 17:11:43
 * @Author：yjh
 */
public class ProxyPoint implements SellTickets{
//    声明火车站类对象
    private TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        System.out.println("代售点收取服务费用");
        trainStation.sell();
    }
}
