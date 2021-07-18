import java.util.Scanner;

public class Calculation_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String calculationType = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (calculationType.equals("add")) {
            printAdd(a, b);
        } else if (calculationType.equals("multiply")) {
            printMultiply(a, b);
        } else if (calculationType.equals("subtract")) {
            printSubtract(a, b);
        } else if (calculationType.equals("divide")) {
            printDivide(a, b);
        }

    }

    private static void printAdd(int a, int b) {
        System.out.println(a + b);
    }

    private static void printMultiply(int a, int b) {
        System.out.println(a * b);
    }

    private static void printSubtract(int a, int b) {
        System.out.println(a - b);
    }

    private static void printDivide(int a, int b) {
        System.out.println(a / b);
    }
}
