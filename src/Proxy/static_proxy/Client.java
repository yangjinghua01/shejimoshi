package Proxy.static_proxy;

public class Client {
    public static void main(String[] args) {
//        创建代售点对象
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
        System.out.println("=======================================================================================>");
//        不使用代理的情况下
        TrainStation trainStation = new TrainStation();
        trainStation.sell();
    }
}
