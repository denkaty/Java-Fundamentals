import java.util.Scanner;

public class MiddleCharacter_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacter(input);
    }

    private static void printMiddleCharacter(String input) {
        if (input.length() % 2 == 0) {
            evenLength(input);
        } else {
            oddLength(input);
        }

    }

    private static void evenLength(String input) {
        int centerOfTheLenght = input.length() / 2;
        String middleCharacters = input.charAt(centerOfTheLenght - 1) + "" + input.charAt(centerOfTheLenght);
        System.out.println(middleCharacters);
    }

    private static void oddLength(String input) {
        int centerOfTheLength = input.length() / 2;
        String middleCharacter = input.charAt(centerOfTheLength) + "";
        System.out.println(middleCharacter);
    }
}