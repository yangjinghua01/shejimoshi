package combintion;
/**
 * @Title菜单项类   属于叶子节点
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class MenuItem extends MenuComponent{
    public MenuItem(String name,int level) {
    this.name = name;
    this.level = level;
    }

    @Override
    public void print() {
//打印菜单项的名称
        for (int i=0;i<level;i++){
            System.out.print("---");
        }
        System.out.println(name);
    }
}
