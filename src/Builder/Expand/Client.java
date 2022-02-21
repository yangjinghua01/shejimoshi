package Builder.Expand;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("骁龙888")
                .memoeey("三星")
                .screen("三星")
                .mainboard("三星")
                .builder();
        System.out.println(phone);
    }
}
