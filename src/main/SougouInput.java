package main;
/**
 * @Title设计原则开闭原则案例
 * @Descriotion 聚合皮肤类搜狗输入法
 *  @Time2022年2月14日 23:29:41
 *  @Author：yjh
 */
public class SougouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display(){
        skin.display();
     }
}
