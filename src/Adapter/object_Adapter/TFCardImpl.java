package Adapter.object_Adapter;

/**
 * @Title适配者类
 * @Time 2022年2月21日 11:44:34
 * @Author：yjh
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TFCard read msg : hellow world";
        return msg;
    }

    @Override
    public void writerTF(String msg) {
        System.out.println("TFCard write msg:"+msg);
    }
}
