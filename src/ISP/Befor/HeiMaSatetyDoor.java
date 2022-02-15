package ISP.Befor;
/**
 * @Title设计原则开闭原则案例
 * @Descriotion 黑马品牌的安全们
 *  @Time2022年2月15日 22:22:31
 *  @Author：yjh
 */
public class HeiMaSatetyDoor implements SafetyDoor{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
