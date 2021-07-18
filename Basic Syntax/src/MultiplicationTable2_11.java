import java.util.Scanner;

public class MultiplicationTable2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (b > 10) {
            int result = n * b;
            System.out.printf("%d X %d = %d", n, b, result);
        } else {
            for (int i = b; i <= 10; i++) {
                int result = n * i;
                System.out.printf("%d X %d = %d%n", n, i, result);
            }
        }
    }
}

