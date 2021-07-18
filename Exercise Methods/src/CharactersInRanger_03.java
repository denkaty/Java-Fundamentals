import java.util.Scanner;

public class CharactersInRanger_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        if (first <= second) {
            printCharactersBetween(first, second);
        } else {
            printCharactersBetween(second, first);
        }

    }

    private static void printCharactersBetween(char from, char to) {
        for (char i = ++from; i < to; i++) {
            System.out.print(i + " ");
        }
    }
}