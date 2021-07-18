import java.util.Scanner;

public class SpecialNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allNumbers = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= allNumbers; i++) {
            int sum = 0;
            int newNumber = i;
            while (newNumber > 0) {
                sum += newNumber % 10;
                newNumber = newNumber / 10;
            }
            boolean isSpecial = sum == 5 || sum == 7 || sum == 11;
            if (isSpecial) {
                System.out.println(i + " -> True");
            } else {
                System.out.println(i + " -> False");
            }
        }
    }
}
