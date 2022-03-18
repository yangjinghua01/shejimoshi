package visitor;

public class SomeOne implements Persion{
    @Override
    public void feed(Cat cat) {
        System.out.println("其他喂猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他喂狗");
    }
}
