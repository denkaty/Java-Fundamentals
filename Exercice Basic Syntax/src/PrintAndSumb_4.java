import java.util.Scanner;

public class PrintAndSumb_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = start; i <=end ; i++) {
            System.out.printf("%d ", i);
            sum = sum + i;
            if (i == end){
                System.out.println();
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
