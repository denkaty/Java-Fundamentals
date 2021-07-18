import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());

        boolean toe = false;

        for (int i = 1; i <= numbers; i++) {
            int digitSum = 0;
            int newNumber = i;

            while (newNumber > 0) {
                digitSum += newNumber % 10;
                newNumber = newNumber / 10;
            }
            boolean isSpecial = (digitSum == 5) || (digitSum == 7) || (digitSum == 11);

            if (isSpecial) {
                System.out.println(i+" -> True");
            }else {
                System.out.println(i+" -> False");
            }
        }

    }
}
