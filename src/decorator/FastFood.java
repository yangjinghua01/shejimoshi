package decorator;
/**
 * @Title定义快餐的抽象类（快餐类）属于抽象构建角色
 * @Time 2022年3月2日 12:54:56
 * @Author：yjh
 */
public abstract class FastFood {
    private Float price;//价格
    private String desc;//描述

    public FastFood() {
    }

    public FastFood(Float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "FastFood{" +
                "price=" + price +
                ", desc='" + desc + '\'' +
                '}';
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public abstract  float cost();
}
