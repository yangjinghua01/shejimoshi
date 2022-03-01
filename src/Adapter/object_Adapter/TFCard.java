package Adapter.object_Adapter;
/**
 * @Title适配者类的接口
 * @Time 2022年2月21日 11:44:34
 * @Author：yjh
 */
public interface TFCard {
//    从TF卡中读取数据
    String readTF();
//    从TF卡中写数据
    void writerTF(String msg);
}
