package state.after;
/**
 * @Title 电梯停止状态类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class StoppingState extends LifrState {
    @Override
    public void open() {
        super.context.setLifrState(Context.OPENING_STATE);
        super.context.getLifrState().open();
    }

    @Override
    public void close() {
        super.context.setLifrState(Context.CLOSEING_STATE);
        super.context.getLifrState().close();
    }

    @Override
    public void runner() {
            super.context.setLifrState(Context.RUNNING_STATE);
            super.context.getLifrState().runner();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }
}
