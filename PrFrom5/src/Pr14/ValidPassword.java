package Pr14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
    public static void main(String[] args) {
        String password1 = "PaSsword123";
        String password2 = "password";
        String password3 = "12345678";
        String password4 = "PASSWORD";

        boolean isValidPassword1 = isValidPassword(password1);
        boolean isValidPassword2 = isValidPassword(password2);
        boolean isValidPassword3 = isValidPassword(password3);
        boolean isValidPassword4 = isValidPassword(password4);

        System.out.println(password1 + " является допустимым паролем? " + isValidPassword1);
        System.out.println(password2 + " является допустимым паролем? " + isValidPassword2);
        System.out.println(password3 + " является допустимым паролем? " + isValidPassword3);
        System.out.println(password4 + " является допустимым паролем? " + isValidPassword4);
    }

    public static boolean isValidPassword(String password) {
        // Регулярное выражение для проверки пароля:
        // - Минимум 8 символов
        // - Маленькая буква (?=.*[a-z])
        // - Заглавная буква (?=.*[A-Z])
        // - Цифра (?=.*\\d)
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}
