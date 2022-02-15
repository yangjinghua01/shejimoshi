package LSP.Befor;
/**
 * @Title设计原则开闭原则案例
 * @Descriotion 正方形类
 *  @Time2022年2月15日 12:38:30
 *  @Author：yjh
 */
public class Square extends Rectangle {
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
