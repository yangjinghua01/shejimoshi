package DIP.Befor;

public class ComputerDemo {
    public static void main(String[] args) {
//        创建组件
        XijieHardDisk hardDisk = new XijieHardDisk();
        InterCpu cpu = new InterCpu();
        KingstonMemory memory = new KingstonMemory();
//        创建计算机对象
        Computer computer = new Computer();
//        组装计算机
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);
        computer.run();
    }
}
