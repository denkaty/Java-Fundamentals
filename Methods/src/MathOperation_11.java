import java.util.Scanner;

public class MathOperation_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int result = result(firstNumber, type, secondNumber);
        System.out.println(result);
    }

    private static int result(int firstNumber, String type, int secondNumber) {
        int result = 0;
        if (type.equals("/")) {
            result = firstNumber / secondNumber;
        } else if (type.equals("*")) {
            result = firstNumber * secondNumber;
        } else if (type.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (type.equals("-")) {
            result = firstNumber - secondNumber;
        }
        return result;
    }

}
