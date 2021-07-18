import java.util.Scanner;

public class MultiplyEvenByOdds_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        int multipliedSums = multiplySums(number);

        System.out.println(multipliedSums);
    }

    private static int multiplySums(int number) {
        int evenSum = getEvenSum(number);
        int oddSum = getSumOfOddDigits(number);

        return evenSum * oddSum;
    }

    private static int getEvenSum(int num) {
        int evenSum = 0;

        while (num != 0) {
            int nextNum = num % 10;

            if (nextNum % 2 == 0) {
                evenSum += nextNum;
            }
            num = num / 10;
        }
        return evenSum;

    }

    private static int getSumOfOddDigits(int num) {
        int oddSum = 0;

        while (num != 0) {
            int nextNum = num % 10;

            if (nextNum % 2 != 0) {
                oddSum += nextNum;
            }
            num = num / 10;
        }
        return oddSum;
    }


}
