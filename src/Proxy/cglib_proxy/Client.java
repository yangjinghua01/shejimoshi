package Proxy.cglib_proxy;

public class Client {
    public static void main(String[] args) {
//        创建代理工厂对象
        ProxyFactory factory =  new ProxyFactory();
//        获取代理对象
        TrainStation proxy = factory.getProxy();
//调用代理对象中的sell方法买票
        proxy.sell();
    }
}
