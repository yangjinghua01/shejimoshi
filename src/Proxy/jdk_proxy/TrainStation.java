package Proxy.jdk_proxy;

/**
 * @Title火车类
 * @Time 2022年2月21日 11:44:34
 * @Author：yjh
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
