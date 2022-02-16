package ISP.After;

/**
 * @Title设计原则接口隔离原则案例
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
        ChuanZhiSatetyDoor door = new ChuanZhiSatetyDoor();
        door.antiTheft();
    }
}
