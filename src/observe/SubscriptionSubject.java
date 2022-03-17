package observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title 具体主题角色类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class SubscriptionSubject implements Subject{
//    定义一个集合用来存储多个观察者对象
    private List<Observer> weixinUserlist = new ArrayList<>();
    @Override
    public void attache(Observer observer) {
        weixinUserlist.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }

    @Override
    public void notify(String message) {
//        遍历结合
        for (Observer observer: weixinUserlist) {
            observer.update(message);
        }
    }
}
