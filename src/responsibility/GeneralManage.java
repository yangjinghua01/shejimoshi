package responsibility;

public class GeneralManage extends Handler{
    public GeneralManage() {
        super(0,NUM_THREE);
    }
    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName()+"请假"+leaveRequest.getNum()+"天"+leaveRequest.getContent()+"。");
        System.out.println("总经理审批同意");
    }
}
