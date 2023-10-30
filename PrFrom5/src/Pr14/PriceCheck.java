package Pr14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceCheck {
    public static void main(String[] args) {
        String text = "Текст со списком цен: 25.98 USD, 100 RUB, 5.99 EU, 44 ERR";

        // Регулярное выражение для поиска цен в USD, RUB и EU
        String regex = "\\b(\\d+(?:\\.\\d{1,2})?)\\s+(USD|RUB|EU)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Извлечение и вывод найденных цен
        while (matcher.find()) {
            double price = Double.parseDouble(matcher.group(1));
            String currency = matcher.group(2);

            System.out.println("Цена: " + price + " " + currency);
        }
    }
}
