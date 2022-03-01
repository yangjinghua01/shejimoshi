package Adapter.Class_Adapter;

public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    @Override
    public void write(String msg) {
        System.out.println("adapter write tf card");
        writerTF(msg);
    }
}
