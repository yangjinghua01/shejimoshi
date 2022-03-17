package Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title 服务员类（请求者角色）
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class Waitor {
//    持有命令对象
    private List< Command> commands = new ArrayList<Command>();


    public void setCommands(Command cmd) {
        commands.add(cmd);
    }
    public void oderUP(){
        System.out.println("美女服务员：大厨新订单来了");
        for ( Command commadn: commands) {
            commadn.execute();
        }
    }
}
