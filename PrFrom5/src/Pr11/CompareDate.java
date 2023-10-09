package Pr11;

import java.util.Calendar;
import java.util.Date;

public class CompareDate {
    public static int comp(Calendar first){
        Calendar toComp = Calendar.getInstance();
        return first.compareTo(Calendar.getInstance());
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2013, Calendar.OCTOBER, 23, 12, 12, 12);
        System.out.println(comp(cal));
    }
}
