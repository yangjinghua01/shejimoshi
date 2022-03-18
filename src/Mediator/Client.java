package Mediator;

public class Client {
    public static void main(String[] args) {
        MediatorStructure mediatorStructure = new MediatorStructure();
        Tenant tenant = new Tenant("asd",mediatorStructure);
        HouseOwner houseOwner = new HouseOwner("adf",mediatorStructure);
        mediatorStructure.setTenant(tenant);
        mediatorStructure.setHouseOwner(houseOwner);
        tenant.constact("wo yao zu fang zi");
        houseOwner.constact("wo zhe you fang zi");
    }
}
