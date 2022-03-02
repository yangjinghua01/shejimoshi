package decorator;

public class Client {
    public static void main(String[] args) {
//        进行测试
        FastFood food = new FrieRice();
        System.out.println(food.getDesc()+food.getPrice());
        System.out.println("======================================>");
        food =  new Egg(food);
        System.out.println(food.getDesc()+food.cost());
        System.out.println("=======================================>");
        food =  new Egg(food);
        System.out.println(food.getDesc()+food.cost());
        System.out.println("===================================>");
        food = new Bacon(food);
        System.out.println(food.getDesc()+food.cost());
    }
}
