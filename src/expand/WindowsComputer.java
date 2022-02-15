package expand;

public class WindowsComputer extends Computerstore{
    @Override
    public double getPrice() {
        System.out.println("5000");
        return 5000.00D;
    }

    @Override
    public String getColor() {
        System.out.println("星空灰");
        return "星空灰";
    }

    @Override
    public int getMemory() {
        System.out.println("8G");
        return 8;
    }

    @Override
    public float getSize() {
        System.out.println("15寸");
        return 15.0f;
    }
}
