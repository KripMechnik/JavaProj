package Pr7;

public class StringFunc implements StringInterface{
    @Override
    public int counter(String str) {
        return str.length();
    }

    @Override
    public String selection(String str) {
        String newStr = "";

        for (int i = 1; i < str.length(); i+=2){
            newStr += str.charAt(i);
        }
        return newStr;
    }

    @Override
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
