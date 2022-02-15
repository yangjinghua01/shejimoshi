package DIP.After;
/**
 * @Title设计原则开闭原则案例
 * @Descriotion 抽象出来硬盘接口
 *  @Time2022年2月15日 16:14:18
 *  @Author：yjh
 */
public interface HardDisk {
//    存储数据的方法
    public void save(String data);
//    读取数据的方法
    public String get();
}
