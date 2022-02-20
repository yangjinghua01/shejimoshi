package Builder;
/**
 * @Title抽象建造者类
 * @Time 2022年2月20日 17:11:43
 * @Author：yjh
 */
public abstract class Buidler {

//    声明Bike类型的变量，并进行赋值
    protected Bike bike = new Bike();
     public abstract void  buildSeat();
     public abstract void buildFrame();
//     构建自行车的方法
    public abstract Bike createBike();

}
