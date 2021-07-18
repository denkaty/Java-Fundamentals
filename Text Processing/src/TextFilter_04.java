import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {
            String asterisks = "";
            int bannedWordLength = bannedWord.length();

            if (text.contains(bannedWord)) {
                asterisks = numberOfAsterisks(bannedWordLength);
                text = text.replace(bannedWord, asterisks);
            }

        }
        System.out.println(text);

    }

    private static String numberOfAsterisks(int bannedWordLength) {
        List<String> stars = new ArrayList<>();
        for (int i = 0; i < bannedWordLength; i++) {
            stars.add("*");
        }
        return String.join("", stars);
//      return stars.toString().replaceAll("[\\[\\], ]", "");
    }
}
