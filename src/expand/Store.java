package expand;

public class Store {
    private Computerstore computerstore;

    public void setComputerstore(Computerstore computerstore) {
        this.computerstore = computerstore;
    }
    public void buy(){
        System.out.println(computerstore.getMemory()+"");
        System.out.println(computerstore.getColor()+"");
        System.out.println(computerstore.getPrice()+"");
        System.out.println(computerstore.getSize()+"");
    }
}
