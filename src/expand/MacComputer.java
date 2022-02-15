package expand;

public class MacComputer extends Computerstore{
    @Override
    public double getPrice() {
//        System.out.println("14999");
        return 14999.00D;
    }

    @Override
    public String getColor() {
//        System.out.println("星空银");
        return "星空银";
    }

    @Override
    public int getMemory() {
//        System.out.println("16G");
        return 16;
    }

    @Override
    public float getSize() {
//        System.out.println("13寸");
        return 13.0f;
    }
}
