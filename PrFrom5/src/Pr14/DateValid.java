package Pr14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValid {
    public static void main(String[] args) {
        String date1 = "31/12/2022";
        String date2 = "31/12/10000";

        boolean isValidDate1 = isValidDate(date1);
        boolean isValidDate2 = isValidDate(date2);

        System.out.println(date1 + " является допустимой датой? " + isValidDate1);
        System.out.println(date2 + " является допустимой датой? " + isValidDate2);
    }

    public static boolean isValidDate(String date) {
        // Регулярное выражение для проверки даты в формате dd/mm/yyyy
        String regex = "^(0[1-9]|1\\d|2\\d|3[01])/(0[1-9]|1[0-2])/((19|20)\\d\\d)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);


        if (matcher.matches()) {
            // Получение отдельных компонентов даты для дополнительной проверки

            int day = Integer.parseInt(matcher.group(1));
            int month = Integer.parseInt(matcher.group(2));
            int year = Integer.parseInt(matcher.group(3));

            if (year >= 1900 && year <= 9999) {
                // Проверка корректности дня в зависимости от месяца и года
                if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
                    return false;
                } else if (month == 2) {
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        if (day > 29) {
                            return false;
                        }
                    } else {
                        if (day > 28) {
                            return false;
                        }
                    }
                }

                return true;
            }
        }

        return false;
    }
}
