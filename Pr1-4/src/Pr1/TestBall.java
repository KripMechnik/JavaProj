package Pr1;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball ("Black", 5);
        Ball b2 = new Ball ("Pink", 10);
        Ball b3 = new Ball ("Grey"); b3.setRadius(8);
        System.out.println(b1);
        b1.print();
        b2.print();
        b3.print();
    }
}
