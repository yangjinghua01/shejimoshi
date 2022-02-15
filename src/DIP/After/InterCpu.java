package DIP.After;
/**
 * @Title设计原则开闭原则案例
 * @Descriotion InterCpu类
 *  @Time2022年2月15日 15:52:55
 *  @Author：yjh
 */
public class InterCpu implements Cpu {
public void run(){
    System.out.println("使用 Inter 处理器");
}
}
