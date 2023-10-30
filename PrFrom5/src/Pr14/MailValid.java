package Pr14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailValid {
    public static void main(String[] args) {
        String email1 = "test@example.com";
        String email2 = "invalid email";

        boolean isValidEmail1 = isValidEmail(email1);
        boolean isValidEmail2 = isValidEmail(email2);

        System.out.println(email1 + " является допустимым e-mail адресом? " + isValidEmail1);
        System.out.println(email2 + " является допустимым e-mail адресом? " + isValidEmail2);
    }

    public static boolean isValidEmail(String email) {
        // Регулярное выражение для проверки e-mail адреса в соответствии с RFC 2822
        String regex = """
                ^(([A-Za-z0-9!#$%&'*+/=?^_`{|}~-]+(\\.[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]+)*@([A-Za-z0-9]([A-Za-z0-9-]*[A-Za-z0-9])?\\.)+[A-Za-z]{2,}))|(".+")$""";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
