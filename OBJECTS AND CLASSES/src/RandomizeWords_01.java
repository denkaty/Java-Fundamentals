import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Random random = new Random();
        for (int i = 0; i < words.length; i++) {
            int randomIndex = random.nextInt(words.length);

            String currentWord = words[i];
            words[i] = words[randomIndex];
            words[randomIndex] = currentWord;
        }

        for (String word : words) {
            System.out.println(word);
        }

    }
}
