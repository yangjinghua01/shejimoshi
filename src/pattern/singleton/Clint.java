package pattern.singleton;
/**
 * @Title设计模式
 * @Descriotion 单例模式测试类  -饿汉式1---->静态成员变量方式
 *  @Time2022年2月16日 17:01:03
 *  @Author：yjh
 */
public class Clint {
    public static void main(String[] args) {
//        创建Singletot类的对象
        Singletot instance = Singletot.getInstance();
        Singletot instance1 = Singletot.getInstance();
//        判断获取到的两个是否是同一个对象
        System.out.println( instance == instance1);
    }
}
