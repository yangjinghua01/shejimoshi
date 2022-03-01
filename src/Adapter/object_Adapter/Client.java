package Adapter.object_Adapter;

public class Client {
    public static void main(String[] args) {
//        创建计算机对象
        Computer computer = new Computer();
//        读取SD卡中的数据
        String s = computer.readSD(new SDImpl());
        System.out.println(s);
        System.out.println("========================================>");
//    使用该电脑读取TF卡中的数据
//        创建适配器类对象
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String s1 = computer.readSD(sdAdapterTF);
        System.out.println(s1);
    }
}
