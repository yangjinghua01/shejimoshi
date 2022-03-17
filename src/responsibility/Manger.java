package responsibility;

public class Manger extends Handler{
    public Manger() {
        super(0,NUM_THREE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName()+"请假"+leaveRequest.getNum()+"天"+leaveRequest.getContent()+"。");
        System.out.println("部门经理同意");
    }
}
