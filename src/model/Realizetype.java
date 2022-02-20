package model;
/**
 * @Title克隆
 * @Time 2022年2月20日 17:11:43
 * @Author：yjh
 */
public class Realizetype  implements Cloneable{
    public Realizetype() {
        System.out.println("具体的原型对象创建完成");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复杂成功");
        return super.clone();
    }
}
