package Mediator;
/**
 * @Title 具体同事类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }
//    和中介联系沟通
    public void constact(String messge){
        mediator.constact(messge,this);
    }
//获取信息
    public void getMessage(String message){
        System.out.println("租房者"+name+"获取到的信息"+message);
    }
}
