package Builder;
/**
 * @Title具体的构建者，用来构建膜拜单车对象
 * @Time 2022年2月20日 17:11:43
 * @Author：yjh
 */
public class MobileBuilder extends Buidler{
    @Override
    public void buildSeat() {
        bike.setSeat("铝合金车座");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
