package Pr11;

import java.util.*;

public class InputDate {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int y = sc.nextInt();
//        int m = sc.nextInt();
//        int d = sc.nextInt();
//        int h = sc.nextInt();
//        int min = sc.nextInt();
//        Date date = new Date(y, m, d, h, min);
//        Calendar cal = Calendar.getInstance();
//        cal.set(y, m, d, h, min);


        ArrayList<Integer> arr = new ArrayList<Integer>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            arr.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        LinkedList<Integer> arr1 = new LinkedList<Integer>();
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            arr1.add(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
    }
}
