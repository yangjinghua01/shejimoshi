package facade;

public class Client {
    public static void main(String[] args) {
//        创建智能音箱对象
        SmartApplianceFacade smartApplianceFacade = new SmartApplianceFacade();
        smartApplianceFacade.say("打开家电");
        System.out.println("=====================================================>");
        smartApplianceFacade.say("关闭家电");
    }
}
