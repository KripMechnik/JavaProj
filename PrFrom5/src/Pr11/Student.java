package Pr11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class Student { //Имя, Фамилия, Специальность, Курс, Группа
    private String name;
    private String surname;
    private String speciality;
    private int course;
    private String group;
    private Double GPA;
    private Calendar bornDate;

    public Student(String name, String surname, String speciality, int course, String group, double GPA, Calendar bornDate) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
        this.bornDate = bornDate;
    }

    public Student() {
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    public String toString(String format) {
        if (Objects.equals(format, "short")){
            SimpleDateFormat dateFormatter = new SimpleDateFormat("y-M-d");
            return dateFormatter.format(bornDate.getTime());
        } else if (Objects.equals(format, "full")){
            SimpleDateFormat dateFormatter = new SimpleDateFormat("d MMMM yyyy");
            return dateFormatter.format(bornDate.getTime());
        } else {
            return bornDate.getTime().toString();
        }
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2004, Calendar.APRIL, 25);
        Student st = new Student("name", "surname", "spec", 2, "group6", 4.5, cal);
        System.out.println(st.toString("short"));
    }
}
