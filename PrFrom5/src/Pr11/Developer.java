package Pr11;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Developer {
    private String name;
    private Calendar begin = Calendar.getInstance();
    private Date end = new Date();

    public Developer(String name) {
        this.name = name;
        this.begin = setBegin();
    }

    private Calendar setBegin(){
        this.begin.set(2023, Calendar.SEPTEMBER, 1, 12, 55, 00);
        return this.begin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
    public void printEnd(){
        SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        System.out.println(dateFormatter.format(end));
    }
    public void printBegin(){
        SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        System.out.println(dateFormatter.format(begin.getTime()));

    }

    public static void main(String[] args) {
        Developer dev = new Developer("Dmitry");
        dev.printBegin();
        dev.printEnd();
    }
}
