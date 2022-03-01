package Adapter.Class_Adapter;
/**
 * @Title计算机类
 * @Time 2022年2月21日 11:44:34
 * @Author：yjh
 */
public class Computer {
//    从SD卡里读取数据
    public String readSD(SDCard sdCard){
        if (sdCard == null){
        throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}
