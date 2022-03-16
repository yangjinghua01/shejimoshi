package strategy;

public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
        System.out.println("========================================");
        SalesMan salesMan1 = new SalesMan(new StrategyB());
        salesMan1.salesManShow();
    }
}
