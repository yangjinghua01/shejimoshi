package main;
/**
 * @Title设计原则开闭原则案例
 * @Descriotion 测试类
 *  @Time2022年2月14日 23:29:41
 *  @Author：yjh
 */
public class Client {
    public static void main(String[] args) {
//        1.创建搜狗输入法对象
        SougouInput sougouInput = new SougouInput();
//        2.创建皮肤对象
        DefaultSkin skin = new DefaultSkin();
//        3.将皮肤设置到输入法中。
        sougouInput.setSkin(skin);
//        4.显示皮肤
         sougouInput.display();
    }
}
