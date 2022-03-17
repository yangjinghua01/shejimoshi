package state.after;

import state.before.Lift;

/**
 * @Title 环境角色类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class Context {
//    定义对应状态对象的常量
    public final static OpeningState OPENING_STATE = new OpeningState();
    public final static CloseingState CLOSEING_STATE = new CloseingState();
    public final  static RunningState RUNNING_STATE = new RunningState();
    public final  static  StoppingState STOPPING_STATE = new StoppingState();
//    定义当前电梯状态变量
    private LifrState lifrState;
    public LifrState getLifrState(){
        return lifrState;
    }
//    设置当前状态对象
    public void setLifrState(LifrState lifrState){
        this.lifrState = lifrState;
//        设置当前状态对象中的Context对象
        this.lifrState.setContext(this);
    }
    public void open(){
        this.lifrState.open();
    }
    public void close(){
            this.lifrState.close();
    }
    public void run(){
        this.lifrState.runner();
    }
    public void stop(){
        this.lifrState.stop();
    }
}
