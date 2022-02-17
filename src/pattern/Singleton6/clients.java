package pattern.Singleton6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Title设计模式
 * @Descriotion 单例模式  ---->反射进行破坏
 * @Time2022年2月16日 17:01:03
 * @Author：yjh
 */
public class clients {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//   1.获取Singleton的字节码对象
        Class<singleon> singleonClass = singleon.class;
//   2.获取无参构造方法对象
        Constructor<singleon> declaredConstructor = singleonClass.getDeclaredConstructor();
//    3.取消方位检查
        declaredConstructor.setAccessible(true);
//    4.创建Singleton对象
        singleon singleon = (singleon) declaredConstructor.newInstance();
        singleon singleon1 = (singleon) declaredConstructor.newInstance();
        System.out.println(singleon1 == singleon);
    }
}
