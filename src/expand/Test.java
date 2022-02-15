package expand;

public class Test {
    public static void main(String[] args) {
//1.实例化聚合类
        Store store = new Store();
//        2.创建具体对象
        MacComputer macComputer = new MacComputer();
//        聚合类设置具体对象
        store.setComputerstore(macComputer);
//        聚合类使用方法
        store.buy();
    }
}
