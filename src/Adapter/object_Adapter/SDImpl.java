package Adapter.object_Adapter;

/**
 * @Title具体的SD卡
 * @Time 2022年3月1日 22:02:15
 * @Author：yjh
 */
public class SDImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard read msg : hello word SD";
        return msg;
    }

    @Override
    public void write(String msg) {
        System.out.println("SDCard write msg："+msg);
    }
}
