import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s");

        String result = "";
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            int currentWordLength = currentWord.length();
            result += repeatWord(currentWord, currentWordLength);
        }
        System.out.println(result);

    }

    private static String repeatWord(String currentWord, int wordLength) {
        String result = "";
        for (int i = 0; i < wordLength; i++) {
            result += currentWord;
        }
        return result;
    }
}
