package Pr7;

public class Test {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        System.out.println(mc1.degree(2, -2));
        System.out.println(mc1.circleLength(3));
        StringInterface s = new StringFunc();
        System.out.println(s.counter("shdjsjkksdl"));
        System.out.println(s.reverse("abcdefg"));
        System.out.println(s.selection("0123456789"));
    }
}
