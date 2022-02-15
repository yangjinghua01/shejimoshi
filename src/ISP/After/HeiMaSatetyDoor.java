package ISP.After;

public class HeiMaSatetyDoor implements antiTheft,Fireproof,Waterproof{
    @Override
    public void fireProof() {
        System.out.println("防盗接口抽象的防盗方法");
    }

    @Override
    public void waterProof() {
        System.out.println("防水接口抽象出来的防水方法");
    }

    @Override
    public void antiTheft() {
        System.out.println("防火接口抽象的防火方法");
    }
}
