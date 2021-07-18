import java.util.Scanner;

public class LettersChangeNumbers_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double sum = 0;
        for (int i = 0; i < input.length; i++) {
            String currentString = input[i];

            char firstLatter = currentString.charAt(0);
            int number = Integer.parseInt(currentString.substring(1, currentString.length() - 1));
            char lastLatter = currentString.charAt(currentString.length() - 1);

            if (Character.isUpperCase(firstLatter)) {
                int firstLatterAlphabetPosition = (int) firstLatter - 'A' + 1;
                double result = 1.00 * number / firstLatterAlphabetPosition;
                sum += result;
            } else {
                int firstLatterAlphabetPosition = (int) firstLatter - 'a' + 1;
                double result = 1.00 * number * firstLatterAlphabetPosition;
                sum += result;
            }

            if (Character.isUpperCase(lastLatter)) {
                int lastLatterAlphabetPosition = (int) lastLatter - 'A' + 1;
                sum = sum - lastLatterAlphabetPosition;
            } else {
                int lastLatterAlphabetPosition = (int) lastLatter - 'a' + 1;
                sum = sum + lastLatterAlphabetPosition;
            }
        }
        System.out.printf("%.02f", sum);
    }
}