import java.util.Scanner;

public class SumOfDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int digitSum = 0;

        while (number > 0) {
            digitSum += number % 10;
            number = number / 10;
        }
        System.out.println(digitSum);
    }
}
