package Proxy.cglib_proxy;
/**
 * @Title 代理对象工厂用来获取代理对象
 * @Time 2022年2月21日 11:44:34
 * @Author：yjh
 */
public class ProxyFactory implements MethodInterceptor{
    public TrainStation getProxy(){
//        创建Enhancer对象，类似JDK代理中的Proxy类
//        因为引入jar失败下面的代码进行注释不然看着难受
        Enhancer enhancer = new Enhancer();
//        设置父类的字节码对象
//        因为引入jar失败下面的代码进行注释不然看着难受
        enhancer.setSuperclass(TrainStation.class);
//        设置回调函数
        enhancer.setCallback();
//        创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return  proxyObject;
    }
}
