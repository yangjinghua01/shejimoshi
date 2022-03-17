package observe;
/**
 * @Title 抽象主题类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public interface Subject {
//添加订阅者（添加观察对象）
    void attache(Observer observer);
//删除订阅者
    void detach(Observer observer);
//    通知订阅者更新消息
    void notify(String message);
}
