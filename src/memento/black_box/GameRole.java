package memento.black_box;



/**
 * @Title 游戏角色类（属于发起人角色）
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class GameRole {
    private int vit;   //生命力
    private int atk;   //攻击力
    private int def;   //防御力
//    初始化状态方法
    public void initState(){
       this.vit =100;
       this.atk =100;
       this.def =100;
    }
//    战斗
    public void fight(){
        this.atk =0;
        this.def =0;
        this.vit =0;
    }
//    保存角色状态功能
    public Memento saveState(){
        return new RoleStatusMement(vit,def,atk);
    }
//    恢复角色状态
    public void recoverState(Memento memento){
//        将备忘录中存储的状态复制给当前对象的的成员
        RoleStatusMement roleStatusMement = (RoleStatusMement) memento;
        this.atk =roleStatusMement.getAtk();
        this.vit =roleStatusMement.getVit();
        this.def =roleStatusMement.getDef();
    }
//    展示状态
    public void StateDisplay(){
        System.out.println("角色生命力"+vit);
        System.out.println("角色攻击力"+atk);
        System.out.println("角色防御力"+def);
    }
    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
    private class RoleStatusMement implements Memento{
        private int vit;   //生命力
        private int atk;   //攻击力
        private int def;   //防御力

        public RoleStatusMement() {
        }

        public RoleStatusMement(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }

        public int getVit() {
            return vit;
        }

        public void setVit(int vit) {
            this.vit = vit;
        }

        public int getAtk() {
            return atk;
        }

        public void setAtk(int atk) {
            this.atk = atk;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }
    }
}
