import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] charArray = input.toCharArray();

        StringBuilder result = new StringBuilder(input);
        int i = 0;
        while (i < result.length() - 1) {
            char current = result.charAt(i);
            char next = result.charAt(i + 1);

            if (current == next) {
                result.deleteCharAt(i + 1);
            }else {
                i++;
            }
        }
        System.out.println(result);

    }
}
