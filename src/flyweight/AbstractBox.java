package flyweight;
/**
 * @Title菜单项类   抽象享元角色
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public abstract class AbstractBox {
//    获取图形的方法
    public abstract String getShape();
//    显示图形的颜色
    public void display(String color){
        System.out.println("方块形状："+getShape()+"颜色:"+color);
    }
}
