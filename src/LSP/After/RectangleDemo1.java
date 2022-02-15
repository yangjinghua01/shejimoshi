package LSP.After;

public class RectangleDemo1 {
    public static void main(String[] args) {
//创建长方形对象
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
//        拓宽操作
        resize(rectangle);
        printLengthAndWidth(rectangle);
//
    }

    //    拓宽的方法
    public static void resize(Rectangle rectangle) {
//判断宽比长小，进行拓宽操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getLength() + 1);
        }
    }

    //    打印长宽的方法
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getwidth());
    }
}
