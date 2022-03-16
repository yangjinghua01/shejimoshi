package Template;

public class ConcreteClass_ChaoCaiXin extends AbstractVClass{
    @Override
    public void pourVegtable() {
        System.out.println("下锅的是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的是蒜蓉");
    }
}
