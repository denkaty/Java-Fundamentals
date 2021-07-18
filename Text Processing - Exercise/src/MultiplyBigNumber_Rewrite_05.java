import java.util.Scanner;

public class MultiplyBigNumber_Rewrite_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String reallyBigNumber = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 0) {
            System.out.println("0");
            return;
        }

        while (reallyBigNumber.charAt(0) == '0') {
            reallyBigNumber = reallyBigNumber.substring(1);
        }

        int reminder = 0;
        StringBuilder finalResult = new StringBuilder();
        for (int i = reallyBigNumber.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(reallyBigNumber.charAt(i)));
            int result = 0;

            result = digit * number + reminder;
            reminder = 0;

            if (result > 9) {
                reminder = result / 10;
                result = result % 10;
            }

            finalResult.insert(0, result);
        }

        if (reminder != 0) {
            finalResult.insert(0, reminder);
        }
        System.out.println(finalResult);
    }
}
