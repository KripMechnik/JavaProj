package Pr14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersWithPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        boolean containsDigitsWithoutPlus = checkDigitsWithoutPlus(text);
        if (containsDigitsWithoutPlus) {
            System.out.println("В тексте присутствуют цифры без знака '+'");
        } else {
            System.out.println("В тексте отсутствуют цифры без знака '+'");
        }
    }

    private static boolean checkDigitsWithoutPlus(String text) {
        Pattern pattern = Pattern.compile("\\d(?![\\s*+])");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
}
