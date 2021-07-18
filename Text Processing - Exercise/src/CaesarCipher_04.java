import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        char[] charArray = text.toCharArray();

        StringBuilder cryptedText = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            cryptedText.append(currentChar += 3);
        }
        System.out.println(cryptedText);

    }
}
