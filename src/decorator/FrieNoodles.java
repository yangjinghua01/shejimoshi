package decorator;
/**
 * @Title炒面（具体的构建角色）
 * @Time 2022年2月21日 11:44:34
 * @Author：yjh
 */
public class FrieNoodles extends FastFood{
    public FrieNoodles(){
        super(20F,"面条");
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
