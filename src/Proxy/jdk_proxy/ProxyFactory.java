package Proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Title获取代理对象的工厂类
 * @Time 2022年2月21日 12:03:27
 * 代理类也实现了对应的接口
 * @Author：yjh
 */
public class ProxyFactory {
    //    声明目标对象
    private TrainStation station = new TrainStation();
//获取代理对象的方法
    public SellTickets getProxyObject() {
//        返回代理对象即可
        /**
         * ClassLoader loader 类加载器，用于加载代理类，可以通过目标对象获取类
         * Class<?>[] interfaces 代理类实现的接口的字节码对象
         * InvocationHandler h   代理对象的调用处理程序
         */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(station.getClass().getClassLoader(), station.getClass().getInterfaces(), new InvocationHandler() {
            /**
             *
             * @param proxy 代理对象 proxyObject，在invoke方法中基本不用
             * @param method  对接口中方法进行封装的Method对象
             * @param args 调用方法的实际参数
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                System.out.println("invoke方法执行了");
//                执行目标对象的方法
                System.out.println("代售点收取一定的费用（jdk动态代理）");
                Object invoke = method.invoke(station, args);
                return null;
            }
        });
        return proxyObject;
    }
}
