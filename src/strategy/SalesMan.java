package strategy;
/**
 * @Title 环境类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class SalesMan {
//聚合策略对象
   private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }
//    由促销员展示促销活动
    public void salesManShow(){
         strategy.show();
    }
}
