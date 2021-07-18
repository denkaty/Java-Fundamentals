import java.util.Scanner;

public class SumOfOddNumbers_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int beginning = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(beginning);
            sum += beginning;
            beginning += 2;
        }
        System.out.printf("Sum: %d", sum);
    }
}
