package strategy;
/**
 * @Title 具体策略类 封装算法的
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满一千元加一元，购买任意200元以下的物品");
    }
}
