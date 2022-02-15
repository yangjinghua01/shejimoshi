package LSP.After;

/**
 * @Title设计原则开闭原则案例
 * @Descriotion 正方形类
 *  @Time2022年2月15日 15:06:56
 *  @Author：yjh
 */
public class Square implements Quadrilateral{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getwidth() {
        return side;
    }
}
