package memento.black_box;

import memento.white_box.RoleStatusMement;

/**
 * @Title 备忘录管理角色
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class RoleStateCaretaker {
private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
