package observe;
/**
 * @Title 具体观察者角色类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class WeiXinUser implements Observer{
    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "========="+message);
    }
}
