package LSP.After;
/**
 * @Title设计原则开闭原则案例
 * @Descriotion 长方形类
 *  @Time2022年2月15日 15:10:14
 *  @Author：yjh
 */
public class Rectangle implements Quadrilateral{
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getwidth() {
        return width;
    }
}
