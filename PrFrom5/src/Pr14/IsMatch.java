package Pr14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IsMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "^abcdefghijklmnopqrstuv18340$";
        boolean isMatch = Pattern.matches(regex, input);

        if (isMatch) {
            System.out.println("Строка соответствует заданному шаблону.");
        } else {
            System.out.println("Строка не соответствует заданному шаблону.");
        }
    }
}
