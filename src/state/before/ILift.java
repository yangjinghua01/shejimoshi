package state.before;
/**
 * @Title 电梯接口
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public interface ILift {
//定义四个电梯状态的常量
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;
//    设置电梯状态的功能
    void setState(int state);
    void open();
    void close();
    void run();
    void stop();

}
