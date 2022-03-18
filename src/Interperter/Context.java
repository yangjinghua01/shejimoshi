package Interperter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title 环境对象
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class Context {
//  定义map集合用来存储变量及对应的值
    private Map<Variable,Integer> map = new HashMap<>();
//    添加变量的功能
    public void assign(Variable variable,Integer value){
        map.put(variable,value);
    }
//    根据变量获取对应的值
    public int getvalue(Variable variable){
        return map.get(variable);
    }
}
