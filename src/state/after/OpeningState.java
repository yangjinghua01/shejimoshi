package state.after;
/**
 * @Title 电梯开启状态类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class OpeningState extends LifrState {
    @Override
    public void open() {
        System.out.println("电梯开启");
    }

    @Override
    public void close() {
        super.context.setLifrState(Context.CLOSEING_STATE);
        super.context.close();
    }

    @Override
    public void runner() {

    }

    @Override
    public void stop() {

    }
}
