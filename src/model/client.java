package model;

public class client {
    public static void main(String[] args) throws CloneNotSupportedException {
//        创建一个原型类对象
        Realizetype realizetype = new Realizetype();
//        调用Realizetype类中的clone方法进行对象的克隆
        Realizetype clone  = (Realizetype) realizetype.clone();
        System.out.println(realizetype == clone);
    }
}
