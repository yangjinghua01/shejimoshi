package FactoryConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @Title咖啡工厂
 * @Time 2022年2月17日 12:21:10
 * @Author：yjh
 */
public class CoffeeFactory {
    //    加载配置文件，获取配置的全类名，并创建该类的对象进行存储
    //      定义容器对象，储存咖啡对象
    private static HashMap<String, Coffee> map = new HashMap<String, Coffee>();

    //2.加载配置文件。只需要加载一次。
    {
        //2.1创建Properties对象
        Properties p = new Properties();
        //2.2调用p对象的load方法进行配置文件的加载
        InputStream inputStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(inputStream);
//            从p集和中获取全类名并创建对象
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String) key);
//                通过反射技术创建对象
                Class<?> clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
//         将名称和对象存储到容器
                map.put((String) key,coffee);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
    public static Coffee creatCoffee(String name){
        return map.get(name);
    }


}
