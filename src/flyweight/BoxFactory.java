package flyweight;

import java.util.HashMap;

/**
 * @Title菜单项类   工厂类，将该类设计成单例
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */

public class BoxFactory {
    private HashMap<String,AbstractBox>map;
//    在构造方法中进行初始化操作
    private BoxFactory(){
        map = new HashMap<String,AbstractBox>();
        map.put("I",new Ibox());
        map.put("L",new Lbox());
        map.put("O",new Obox());
    }
    private static BoxFactory boxFactory = new BoxFactory();
//    提供一个方法获取该工厂类对象
    public static BoxFactory getInstance(){
        return boxFactory;
    }
//    根据名称获取图形对象
    public AbstractBox getshape(String name){
        return map.get(name);
    }
}
