package LSP.Befor;

public class RectangleDemo {
    public static void main(String[] args) {
//创建长方形对象
        Rectangle rectangle = new Rectangle();
//设置长和宽
        rectangle.setLength(20);
        rectangle.setWidth(10);
//        调用resize的方法进行拓宽的操作
        resize(rectangle);
//        调用打印的方法
        printLengthAndWidth(rectangle);
        System.out.println("==========================================================================>");
//        创建正方形对象
        Square square = new Square();
//        设置长和宽
        square.setLength(10);
//        square.setLength(10);
//        正方形拓宽
        resize(square);
//        打印结果
        printLengthAndWidth(square);
    }
//    拓宽方法
    public static void resize(Rectangle rectangle){
//判断宽比长小，进行拓宽操作
        while (rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getLength()+1);
        }
    }
//    打印长和宽的方法
    public static void  printLengthAndWidth(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
