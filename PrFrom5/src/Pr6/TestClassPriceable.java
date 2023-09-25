package Pr6;

public class TestClassPriceable implements Priceable{
    private double price;

    public TestClassPriceable(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        TestClassPriceable test = new TestClassPriceable(899.9);
        System.out.println(test.getPrice());
    }
}
