package Adapter.object_Adapter;
/**
 * @Title目标接口
 * @Time 2022年2月21日 11:44:34
 * @Author：yjh
 */
public interface SDCard {
//    从SD卡中读取数据
    String readSD();
//    从SD卡中写数据
    void write(String msg);
}
