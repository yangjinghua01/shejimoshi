package DIP.Befor;
/**
 * @Title设计原则开闭原则案例
 * @Descriotion 希捷硬盘类
 *  @Time2022年2月15日 15:46:41
 *  @Author：yjh
 */
public class XijieHardDisk {
//    存储数据的方法
    public void save(String data){
        System.out.println("使用希捷硬盘存储数据" + data);
    }
//    获取数据的方法
    public String get(){
        System.out.println("使用希捷硬盘读数据");
        return "数据";
    }
}
