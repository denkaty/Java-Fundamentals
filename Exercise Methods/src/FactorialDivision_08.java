import java.util.Scanner;

public class FactorialDivision_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        double firstFactorial = factorial(firstNumber);
        double secondFactorial = factorial(secondNumber);

        double firstDividedSecond = result(firstFactorial, secondFactorial);

        System.out.printf("%.2f", firstDividedSecond);

    }

    private static double factorial(int number) {
        double factorial = 1.0;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static double result(double firstFactorial, double secondFactorial) {
        return 1.0 * firstFactorial / secondFactorial;
    }
}
