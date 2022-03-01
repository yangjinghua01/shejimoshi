package Adapter.object_Adapter;

public class SDAdapterTF  implements SDCard {

//    声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public SDAdapterTF() {

    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void write(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writerTF(msg);
    }
}
