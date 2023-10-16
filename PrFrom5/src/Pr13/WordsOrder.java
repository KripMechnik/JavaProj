package Pr13;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordsOrder {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("base_text.txt"))) {
            String line = reader.readLine();
            String result = getLine(line);

            System.out.println("Расставленные слова: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getLine(String line) {
        if (line == null || line.isEmpty()) {
            return "";
        }

        String[] words = line.split(" ");
        StringBuilder sb = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];
            String previousWord = sb.toString();

            if (currentWord.toLowerCase().charAt(0) == previousWord.toLowerCase().charAt(previousWord.length() - 1)) {
                sb.append(" ").append(currentWord);
            } else {
                sb.insert(0, currentWord + " ");
            }
        }

        return sb.toString();
    }
}
