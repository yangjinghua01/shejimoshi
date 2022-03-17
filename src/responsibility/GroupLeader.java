package responsibility;
/**
 * @Title 小组长类（具体的处理者）
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class GroupLeader  extends Handler{
    public GroupLeader() {
        super(0,NUM_ONE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName()+"请假"+leaveRequest.getNum()+"天"+leaveRequest.getContent()+"。");
        System.out.println("小组长同意");
    }
}
