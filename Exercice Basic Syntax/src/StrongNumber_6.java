import java.util.Scanner;

public class StrongNumber_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberAsString = scanner.nextLine();
        int totalSum = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            int number = Integer.parseInt("" + numberAsString.charAt(i));
            int currentSum = 1;

            for (int j = 1; j <= number; j++) {
                currentSum *= j;
            }

            totalSum += currentSum;
        }
        String totalSumS = totalSum + "";
        if (totalSumS.equals(numberAsString)) {
            System.out.printf("yes");
        } else {
            System.out.printf("no");
        }
    }
}

