package Mediator;
/**
 * @Title 抽象同事类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
