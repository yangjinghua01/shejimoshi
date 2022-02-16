package pattern.singleton4;

/**
 * @Title设计模式
 * @Descriotion 单例模式  - 恶汉式3---->静态内部类
 * @Time2022年2月16日 17:01:03
 * @Author：yjh
 */
public class singleon {
    private singleon() {
    }

    //    定义一个静态的内部类
    private static class singleonHolder {
//在内部类中声明并初始化外部类的对象
        private static final singleon Instance = new singleon();
    }
//    提供公共的访问方式
    public static singleon getInstance(){
        return singleonHolder.Instance;
    }
}
