package responsibility;
/**
 * @Title 抽象处理者类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public abstract class Handler {
    protected final static int NUM_ONE =1;
    protected final static int NUM_THREE =3;
    protected final static int NUM_SEVEN =7;
//    该领导处理的请求天数
    private int numStart;
    private int numEnd;
    private Handler handler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }
//    设置上级领导对象
    public void setNextHandler(Handler handler){
        this.handler =handler;
    }

    //    各级领导处理请求条的方法
    protected abstract void handlerLeave(LeaveRequest leaveRequest);
    public final void submit(LeaveRequest leaveRequest){
        this.handlerLeave(leaveRequest);
        if (this.handler!=null&&leaveRequest.getNum()>this.numEnd){
//            提交给上级领导审批
            this.handler.submit(leaveRequest);
        }else {
            System.out.println("流程结束");
        }
    }
}
