package visitor;

public class Cat implements Animal{
    @Override
    public void accept(Persion persion) {
        persion.feed(this);
        System.out.println("好好吃猫");
    }
}
