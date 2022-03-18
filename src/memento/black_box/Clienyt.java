package memento.black_box;
public class Clienyt {
    public static void main(String[] args) {
        System.out.println("-----------------before");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.StateDisplay();
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());
        System.out.println("----------------------------after");
        gameRole.fight();
        gameRole.StateDisplay();
        System.out.println("-----------------------huidang");
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.StateDisplay();
    }
}
