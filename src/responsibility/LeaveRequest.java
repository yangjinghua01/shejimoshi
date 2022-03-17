package responsibility;
/**
 * @Title 请假条类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class LeaveRequest {
//    姓名
    private String name;
//   请假天数
    private int num;
//    请假内容
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
