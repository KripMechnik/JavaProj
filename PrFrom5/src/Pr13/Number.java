package Pr13;

public class Number {
    private String countryCode;
    private String number;

    public Number(String fullNumber) {
        String invertedNumber = new StringBuilder(fullNumber).reverse().toString();
        String invertedCountryCode = invertedNumber.substring(10);
        this.countryCode = new StringBuilder(invertedCountryCode).reverse().toString();
        String invertedTenNumbers = invertedNumber.substring(0, 10);
        this.number = new StringBuilder(invertedTenNumbers).reverse().toString();
    }

    @Override
    public String toString() {
        return  this.countryCode + " " + this.number.substring(0, 3) + "-" + this.number.substring(3, 6) + "-" + this.number.substring(6);
    }

    public static void main(String[] args) {
        Number num = new Number("+79166386901");
        System.out.println(num);
    }
}
