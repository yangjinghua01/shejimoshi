package ISP.Befor;
/**
 * @Title设计原则开闭原则案例
 * @Descriotion 安全门接口
 *  @Time2022年2月15日 22:16:24
 *  @Author：yjh
 */

public interface SafetyDoor {
    //    防盗的方法
    public void antiTheft();
    //    防火的方法
    public void fireProof();
    //    防水的方法
    public void waterProof();
}
