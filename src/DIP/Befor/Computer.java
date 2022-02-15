package DIP.Befor;

public class Computer {
    private XijieHardDisk hardDisk;
    private InterCpu cpu;
    private KingstonMemory memory;

    public XijieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XijieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public InterCpu getCpu() {
        return cpu;
    }

    public void setCpu(InterCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }
//    运行计算机的方法
    public void  run(){
        System.out.println("运行计算机");
        String data = hardDisk.get();
        System.out.println("从硬盘上获得的数据：=========》"+data);
        cpu.run();
        memory.save();
    }
}
