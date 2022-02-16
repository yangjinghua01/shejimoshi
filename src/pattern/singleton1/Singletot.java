package pattern.singleton1;

/**
 * @Title设计模式
 * @Descriotion 单例模式  -饿汉式2---->静态代码块的方式
 * @Time2022年2月16日 17:01:03
 * @Author：yjh
 */
public class Singletot {
    //    1.私有构造方法
    private Singletot() {
    }

    //    声明Singletot类型的变量
    private static Singletot instance;//初始值为null

    //    在静态代码块中进行赋值
    static {
        instance = new Singletot();
    }

    //对外提供一个访问方式
    public static Singletot getInstance() {
        return instance;
    }

}
