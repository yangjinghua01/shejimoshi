package main;
/**
 * @Title设计原则开闭原则案例
 * @Descriotion 默认皮肤类
 *  @Time2022年2月14日 23:29:41
 *  @Author：yjh
 */
public class DefaultSkin extends AbstractSkin{
    @Override
    public void display() {
        System.out.println("默认皮肤类");
    }
}
