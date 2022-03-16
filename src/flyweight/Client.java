package flyweight;

public class Client {
    public static void main(String[] args) {
//        获取I图形
        AbstractBox box1 = BoxFactory.getInstance().getshape("I");
        box1.display("灰色");
//        获取L图形对象
        AbstractBox box2 = BoxFactory.getInstance().getshape("L");
        box2.display("绿色");
//        获取O图形对象
        AbstractBox box = BoxFactory.getInstance().getshape("O");
        box.display("黑色");
//        获取O图形对象
        AbstractBox box3 = BoxFactory.getInstance().getshape("O");
        box3.display("红色");
        System.out.println("两次获取的O图形对象是否是同一个对象："+(box3 == box));
    }
}
