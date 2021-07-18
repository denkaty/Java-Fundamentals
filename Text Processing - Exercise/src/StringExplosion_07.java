import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int power = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '>') {
                power += Integer.parseInt(String.valueOf(input.charAt(i + 1)));
                result.append('>');
            } else if (power == 0) {
                result.append(currentChar);
            } else {
                power--;
            }
        }
        System.out.println(result);

    }
}
