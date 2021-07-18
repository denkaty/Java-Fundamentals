import java.util.Scanner;

public class PalindromeIntegers_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("END")) {

            String reversed = palindrome(input);
            boolean compare = compare(reversed, input);

            if (compare) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }


            input = scanner.nextLine();
        }
    }

    private static String palindrome(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i) + "";
        }
        return reversed;
    }

    private static boolean compare(String reversed, String input) {
        boolean flag = false;
        if (reversed.equals(input)) {
            flag = true;
        }
        return flag;

    }

}
