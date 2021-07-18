import java.util.Scanner;

public class TriangleOfNumbers_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) { //redovete
            for (int j = 1; j <= i; j++) { //broi chisla
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
