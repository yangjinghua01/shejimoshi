package state.after;
/**
 * @Title 电梯关闭状态类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class CloseingState extends LifrState{
    @Override
    public void open() {
        super.context.setLifrState(Context.OPENING_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }

    @Override
    public void runner() {
        super.context.setLifrState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        super.context.setLifrState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
