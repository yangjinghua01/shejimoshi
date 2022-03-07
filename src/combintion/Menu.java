package combintion;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title菜单类属于树枝节点
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class Menu extends MenuComponent{
//    菜单可以有多个子菜单或者字菜单项
    private List<MenuComponent> menuComponentList = new ArrayList<MenuComponent>();
//    构造方法

    public Menu(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
//先打印菜单名称
        for (int i=0;i<level;i++){
            System.out.println("---");
        }
        System.out.print(name);
//        打印子菜单和字菜单项名称
        for (MenuComponent component:menuComponentList) {
            component.print();
        }
    }
}
