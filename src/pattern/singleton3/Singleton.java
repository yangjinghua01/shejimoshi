package pattern.singleton3;

/**
 * @Title设计模式
 * @Descriotion 单例模式  -懒汉式3---->双锁检查
 * @Time2022年2月16日 17:01:03
 * @Author：yjh
 */
public class Singleton {
    private Singleton() {
    }
    private static volatile Singleton Instance;
//    对外提供的访问方法
    public static Singleton getInstance(){
//        第一次判读如果Instance的值不为null，不需要抢占锁直接返回对象
        if (Instance == null){
            synchronized (Singleton.class){
                if (Instance == null){
                    Instance = new Singleton();
                }
            }
        }
        return Instance;
    }
}
