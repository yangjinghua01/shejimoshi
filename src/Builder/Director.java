package Builder;
/**
 * @Title指挥者类
 * @Time 2022年2月20日 17:11:43
 * @Author：yjh
 */
public class Director {

//    声明Builder类型的变量
    private Buidler buidler;
    public Director(Buidler buidler){
        this.buidler=buidler;
    }
//    组装自行车的功能
    public Bike construct(){
        buidler.buildFrame();
        buidler.buildSeat();
        return buidler.createBike();
    }
}
