package state.after;
/**
 * @Title 电梯运行状态类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class RunningState extends LifrState{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void runner() {
        System.out.println("电梯正在运行");
    }

    @Override
    public void stop() {
        super.context.setLifrState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
