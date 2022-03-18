package Mediator;
/**
 * @Title 具体同事角色类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class HouseOwner extends Person{

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }
    //    和中介联系沟通
    public void constact(String messge){
        mediator.constact(messge,this);
    }
    //获取信息
    public void getMessage(String message){
        System.out.println("房主"+name+"获取到的信息"+message);
    }
}
