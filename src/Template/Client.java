package Template;

public class Client {
    public static void main(String[] args) {
//        炒包菜
//        创建对象
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
//        调用炒菜的功能
        baoCai.cookProcess();
        baoCai.pourSauce();
        baoCai.pourVegtable();
        baoCai.pourVegtable();
    }
}
