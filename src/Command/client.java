package Command;

public class client {
    public static void main(String[] args) {
//        创建订单对象
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("爆炒羊粪蛋",10);
        order1.setFood("辣椒水",1);
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("炖王八",10);
        order2.setFood("辣椒水",1);
//创建厨师对象
        SeniorChef seniorChef = new SeniorChef();
//        创建命令对象
        OrderCommand cmd1 = new OrderCommand(seniorChef,order1);
        OrderCommand cmd2 = new OrderCommand(seniorChef,order2);
//        创建调用者
        Waitor waitor = new Waitor();
        waitor.setCommands(cmd1);
        waitor.setCommands(cmd2);
        waitor.oderUP();

    }
}
