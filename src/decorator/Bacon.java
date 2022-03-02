package decorator;

public class Bacon extends Garnish{
    public Bacon(FastFood fastFood) {
        super(1F,"培根",fastFood);
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
