package visitor;
/**
 * @Title 具体访问者角色
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class Ower implements Persion{
    @Override
    public void feed(Cat cat) {
        System.out.println("主任喂猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主任喂狗");
    }
}
