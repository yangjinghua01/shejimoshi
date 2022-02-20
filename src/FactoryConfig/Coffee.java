package FactoryConfig;
/**
 * @Title咖啡类
 * @Time 2022年2月17日 12:21:10
 * @Author：yjh
 */
public abstract class Coffee {
    public abstract String getName();
//    加糖
    public void addsugar(){
        System.out.println("加糖");
    }
//    加奶
    public void addMilk(){
        System.out.println("加奶");
    }
}
