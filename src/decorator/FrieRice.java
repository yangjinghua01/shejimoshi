package decorator;
/**
 * @Title炒饭（具体构建角色）
 * @Time 2022年3月2日 13:01:39
 * @Author：yjh
 */
public class FrieRice extends FastFood{
    public FrieRice(){
        super(10F,"炒饭");
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
