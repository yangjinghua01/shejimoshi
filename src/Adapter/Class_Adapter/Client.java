package Adapter.Class_Adapter;

public class Client {
    public static void main(String[] args) {
//        创建计算机对象
        Computer computer = new Computer();
//        读取SD卡中的数据
        String s = computer.readSD(new SDImpl());
        System.out.println(s);
        System.out.println("========================================>");
//        定义适配器类
        String s1 = computer.readSD(new SDAdapterTF());
        System.out.println(s1);
    }
}
