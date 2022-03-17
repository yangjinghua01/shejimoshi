package state.before;
/**
 * @Title 电梯类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class Lift  implements ILift{
//    声明一个记录当前电梯状态
    private int state;

//    public Lift(int state) {
//        this.state = state;
//    }

    @Override
    public void setState(int state) {
        this.state =state;
    }

    @Override
    public void open() {
        switch (state){
            case OPENING_STATE :
//                什么事都不做
                break;
            case CLOSING_STATE :
                System.out.println("电梯打开了。。。。。。。");
//                设置当前电梯状态为开启状态
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯打开了。。。。。。。");
//                设置当前电梯状态为开启状态
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void close() {
        switch (state){
            case OPENING_STATE :
//                什么事都不做
                break;
            case CLOSING_STATE :
                System.out.println("电梯打开了。。。。。。。");
//                设置当前电梯状态为开启状态
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯打开了。。。。。。。");
//                设置当前电梯状态为开启状态
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void run() {
        switch (state){
            case OPENING_STATE :
//                什么事都不做
                break;
            case CLOSING_STATE :
                System.out.println("电梯打开了。。。。。。。");
//                设置当前电梯状态为开启状态
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯打开了。。。。。。。");
//                设置当前电梯状态为开启状态
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void stop() {
        switch (state){
            case OPENING_STATE :
//                什么事都不做
                break;
            case CLOSING_STATE :
                System.out.println("电梯打开了。。。。。。。");
//                设置当前电梯状态为开启状态
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯打开了。。。。。。。");
//                设置当前电梯状态为开启状态
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
        }
    }
}
