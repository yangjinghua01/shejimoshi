package Mediator;
/**
 * @Title 具体中介者角色类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class MediatorStructure extends Mediator {
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, Person persion) {
        if (persion == houseOwner){
            tenant.getMessage(message);
        }else {
            houseOwner.getMessage(message);
        }
    }
}
