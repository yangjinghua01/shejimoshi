package pattern.singleton2;

/**
 * @Title设计模式
 * @Descriotion 单例模式  -懒汉式1---->静态成员变量方式
 * @Time2022年2月16日 17:01:03
 * @Author：yjh
 */
public class Singleton {
    //    1.私有构造方法
    private Singleton() {
    }

    //    声明Singleton类型的变量instance
    private static Singleton Instance;//只声明了一个该类型的变量，并没有进行赋值

    //    对外提供访问方式
    public static synchronized Singleton getInstance() {
//        判断Instance 是否为null，如果为null，说明还有有创建Singleton类的对象
//        如果没有创建一个并返回，如果有直接返回
        if (Instance == null) {
//            线程1等待线程2获取到CPU的执行权也是进入该判断
            Instance = new Singleton();
        }
        return Instance;
    }

}
