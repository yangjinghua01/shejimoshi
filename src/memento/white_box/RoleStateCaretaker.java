package memento.white_box;
/**
 * @Title 备忘录管理角色
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class RoleStateCaretaker {
private RoleStatusMement roleStatusMement;

    public RoleStatusMement getRoleStatusMement() {
        return roleStatusMement;
    }

    public void setRoleStatusMement(RoleStatusMement roleStatusMement) {
        this.roleStatusMement = roleStatusMement;
    }
}
