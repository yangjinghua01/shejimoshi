package decorator;
/**
 * @Title配料类（具体的装饰者角色）
 * @Time 2022年2月21日 11:44:34
 * @Author：yjh
 */
public class Egg extends Garnish{
    public Egg(FastFood fastFood) {
        super(1F,"鸡蛋",fastFood);
    }

    @Override
    public float cost() {
//        计算价格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
