package state.after;
/**
 * @Title 抽象状态类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public abstract class LifrState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //    电梯开启操作
    public abstract void open();
//    电梯关闭操作
    public abstract void close();
//    电梯运行操作
    public abstract void runner();
//    电梯停止操作
    public abstract void stop();
}
