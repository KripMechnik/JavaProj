package Pr3;

public class Square extends Rectangle {
    public Square() {
        super("blue", false, 1, 1);
    }
    public Square(double side) {
        super("blue", false, side, side);
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide(){
        return this.width;
    }
    public void setSide(double side){
        this.length = this.width = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
