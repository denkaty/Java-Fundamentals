import java.util.Scanner;

public class PasswordValidator_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean betweenSixAndTen = betweenSixAndTen(input);
        boolean lettersAndDigits = lettersAndDigits(input);
        boolean atLeastTwoDigits = atLeastTwoDigits(input);

        if (!betweenSixAndTen) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!lettersAndDigits) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!atLeastTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (betweenSixAndTen && lettersAndDigits && atLeastTwoDigits) {
            System.out.println("Password is valid");
        }


    }

    private static boolean betweenSixAndTen(String input) {
        boolean flag = false;
        if (input.length() >= 6 && input.length() <= 10) {
            flag = true;
        }
        return flag;
    }

    private static boolean lettersAndDigits(String input) {
        boolean flag = false;
        if (input.matches("[a-zA-z0-9]*")) {
            flag = true;
        }
        return flag;

    }

    private static boolean atLeastTwoDigits(String input) {
        boolean flag = false;
        int counter = 0;
        String[] string = input.split("");

        for (int i = 0; i < string.length; i++) {
            if (string[i].equals("0") || string[i].equals("1") || string[i].equals("2") || string[i].equals("3") || string[i].equals("4") ||
                    string[i].equals("5") || string[i].equals("6") || string[i].equals("7") || string[i].equals("8") || string[i].equals("9")) {
                counter++;
            }
        }
        if (counter >= 2) {
            flag = true;
        }
        return flag;
    }
}
