package decorator;
/**
 * @Title装饰者类的（抽象装饰者角色）
 * @Time 2022年2月21日 11:44:34
 * @Author：yjh
 */
public abstract class Garnish extends FastFood{
//    声明快餐类的变量
    private FastFood fastFood;

    public Garnish(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(Float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
