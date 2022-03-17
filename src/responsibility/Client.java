package responsibility;

public class Client {
    public static void main(String[] args) {
//        创建请假条对象
        LeaveRequest leaveRequest = new LeaveRequest("小明",3,"身体不适");
//        创建各级领导对象
        GroupLeader groupLeader = new GroupLeader();
        Manger manger = new Manger();
        GeneralManage generalManage  = new GeneralManage();
//        设置处理链
        generalManage.setNextHandler(manger);
        manger.setNextHandler(generalManage);
//        小明提交请假申请
        generalManage.submit(leaveRequest);
    }
}
