import java.util.Scanner;

public class TopNumber_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        topNumber(n);


    }

    private static void topNumber(int n) {

        for (int i = 1; i <= n; i++) {
            int sumOfDigits = sumOfDigits(i);

            boolean checkDivisibleBy8 = checkDivisibleBy8(sumOfDigits);
            boolean checkOddDigit = checkOddDigit(i);

            boolean checkConditions = checkConditions(checkDivisibleBy8, checkOddDigit);

            if (checkConditions) {
                System.out.println(i);
            }
        }
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int removeedLastDigit = number % 10;
            sum += removeedLastDigit;
            number = number / 10;
        }
        return sum;

    }

    private static boolean checkDivisibleBy8(int number) {
        boolean flag = false;
        if (number % 8 == 0) {
            flag = true;
        }
        return flag;
    }

    private static boolean checkOddDigit(int number) {
        boolean flag = false;
        int counter = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                counter++;
            }
            number = number / 10;
        }
        if (counter >= 1) {
            flag = true;
        }
        return flag;
    }

    private static boolean checkConditions(boolean checkDivisibleBy8, boolean checkOddDigit) {
        boolean flag = false;
        if (checkDivisibleBy8 && checkOddDigit) {
            flag = true;
        }
        return flag;
    }


}
