package iterrator;
/**
 * @Title 抽象迭代器角色
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public interface StudentInterrator  {
//    判断是狗还有元素
    boolean hasNext();
//    获取下一个元素
    Student next();
}
