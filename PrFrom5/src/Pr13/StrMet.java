package Pr13;

public class StrMet {
    public static void strOperations(String str){
        System.out.println("Последний символ " + str.charAt(str.length()-1));
        if (str.endsWith("!!!")){
            System.out.println("Строка заканчивается на '!!!'");
        } else {
            System.out.println("Строка не заканчивается на '!!!'");
        }

        if (str.startsWith("I like")){
            System.out.println("Строка начинается с 'I like'");
        } else {
            System.out.println("Строка не начинается с 'I like'");
        }

        if (str.contains("Java")){
            System.out.println("Строка содержит 'Java'");
        } else {
            System.out.println("Строка не содержит 'Java'");
        }

        System.out.println("Позиция подстроки 'Java' " + str.indexOf("Java"));

        System.out.println(str.replaceAll("a", "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0, str.indexOf("Java")));
    }

    public static void main(String[] args) {
        strOperations("I like Java!!!");
    }
}
