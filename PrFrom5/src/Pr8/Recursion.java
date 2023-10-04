package Pr8;

public class Recursion {
    private int start = 1;
    private int sum = 0;
    private boolean first_sign = true;
    private int counter = 0;
    public void first_recursion(int n){
        if (this.start == n){
            System.out.println(n);
            start = 1;
        } else {
            System.out.println(this.start);
            this.start++;
            first_recursion(n);
        }
    }

    public void second_recursion(int start, int end){
        if(start == end) {
            System.out.println(end);
        } else if(start < end){
            System.out.println(start);
            second_recursion(start+1, end);
        } else {
            System.out.println(end);
            second_recursion(end+1, start);
        }
    }


    public int third_recursion(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;

        for (int i = c; i < 10; i++) {
            res += third_recursion(len + 1, sum + i, k, s);
        }
        return res;
    }


    public static void main(String[] args) {
        Recursion rec = new Recursion();
        //rec.first_recursion(10);
        //System.out.println("///////");
        //rec.second_recursion(20, 10);
        System.out.println(rec.third_recursion(0, 0, 2, 2));
    }
}
