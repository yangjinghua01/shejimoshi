package memento.white_box;

public class Clienyt {
    public static void main(String[] args) {
        System.out.println("-----------------before");
        GameRole gameRole = new GameRole();
        gameRole.initState();//初始化状态
        gameRole.StateDisplay();
//        将状态备份
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStatusMement(gameRole.saveState());
        System.out.println("----------------------------after");
        gameRole.fight();
        gameRole.StateDisplay();
        System.out.println("-----------------------huidang");
        gameRole.recoverState(roleStateCaretaker.getRoleStatusMement());
        gameRole.StateDisplay();
    }
}
