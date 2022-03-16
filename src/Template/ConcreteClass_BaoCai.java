package Template;
/**
 * @Title 基本方法  炒包菜类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class ConcreteClass_BaoCai extends AbstractVClass{
    @Override
    public void pourVegtable() {
        System.out.println("下锅蔬菜是包菜");
    }
    @Override
    public void pourSauce() {
        System.out.println("下过的酱料是辣椒");
    }
}
