import java.util.Scanner;

public class AddAndSubtract_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int sumAB = result(a, b);
        int subtract = subtract(sumAB, c);

        System.out.println(subtract);
    }

    private static int result(int a, int b) {
        return a + b;
    }

    private static int subtract(int sumAB, int c) {
        return sumAB - c;
    }
}
