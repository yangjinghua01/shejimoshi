package pattern.singleton;
/**
 * @Title设计模式
 * @Descriotion 单例模式  -饿汉式1---->静态成员变量方式
 *  @Time2022年2月16日 17:01:03
 *  @Author：yjh
 */
public class Singletot {
//    1.私有构造方法
    private Singletot() {
    }
//    2.在本类中创建本类对象
    private static Singletot instance = new Singletot();
//    3.提供一个公共的访问方式，让外界获取该对象
     public static Singletot getInstance(){
         return instance;
     }
}
