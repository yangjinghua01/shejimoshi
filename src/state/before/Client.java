package state.before;

public class Client {
    public static void main(String[] args) {
//        创建电梯对象
        Lift lift = new Lift();
        lift.setState(ILift.CLOSING_STATE);
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
