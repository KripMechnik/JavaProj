package Pr13;

import java.util.StringTokenizer;

public class Addres {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String flat;

    public Addres(String addresStr) {
        StringTokenizer tokenizer = new StringTokenizer(addresStr, ",; .");
        this.country = tokenizer.nextToken();
        this.region = tokenizer.nextToken();
        this.city = tokenizer.nextToken();
        this.street = tokenizer.nextToken();
        this.house = tokenizer.nextToken();
        this.flat = tokenizer.nextToken();
    }

    @Override
    public String toString() {
        return "Addres{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Addres addres = new Addres("Россия, МО, Дмитров, Космонавтов, 54, 204");
        Addres addres1 = new Addres("Россия; МО; Дмитров; Космонавтов; 54; 204");
        System.out.println(addres);
        System.out.println(addres1);
    }
}
