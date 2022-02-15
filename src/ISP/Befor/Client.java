package ISP.Befor;

/**
 * @Title设计原则开闭原则案例
 * @Descriotion 测试类
 *  @Time2022年2月15日 22:16:24
 *  @Author：yjh
 */
public class Client {
    public static void main(String[] args) {
        HeiMaSatetyDoor heiMaSatetyDoor = new HeiMaSatetyDoor();
        heiMaSatetyDoor.antiTheft();
        heiMaSatetyDoor.fireProof();
        heiMaSatetyDoor.waterProof();
    }
    /**
     * 发现的问题。拓展性不好。假如我现在又有一个叫船只的门这个门只能防盗。还用过安全们接口实现。传值门被迫依赖了两个它不使用的方法
     */
}
