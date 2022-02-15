package DIP.After;

public class ComputerDemo1 {
    public static void main(String[] args) {
//        创建组件
        HardDisk hardDisk = new XijieHardDisk();
        Cpu cpu = new InterCpu();
        Memory memory = new KingstonMemory();
//        创建计算机对象
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setMemory(memory);
        computer.setHardDisk(hardDisk);
        computer.run();
    }
}
