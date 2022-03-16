package Template;

/**
 * @Title抽象类 （定义模板方法和基本方法）
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public abstract class AbstractVClass {
//    模板方法定义
    public void cookProcess(){
        pourOil();
        heatOi();
        pourVegtable();
        pourSauce();
        fry();
    }
    public void pourOil(){
        System.out.println("倒油");
    }
    //    第二步热油是一样的
    public void heatOi(){
        System.out.println("热油");
    }
    //    第三步倒蔬菜是不一样的（一个下包菜一个下菜心）
    public abstract void pourVegtable();
    //    第四步：倒调味料是不一样
    public abstract void pourSauce();
    //    第五步：翻炒是一样的，所以直接实现
    public void fry() {
        System.out.println("炒啊炒啊，炒倒熟");
    }
}
