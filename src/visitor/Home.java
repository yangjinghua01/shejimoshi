package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title 对象结构类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class Home {
//声明一个集合对象
    private List<Animal> nodelist = new ArrayList<>();
    public void add (Animal animal){
        nodelist.add(animal);
    }
    public void action(Persion persion){
        for (Animal animal : nodelist) {
            animal.accept(persion);
        }
    }
}
