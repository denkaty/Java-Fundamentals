import java.util.Scanner;

public class NxNMatrix_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printMatrix(n);
    }

    private static void printMatrix(int input) {
        for (int rows = 1; rows <= input; rows++) {
            for (int number = 1 ; number <= input; number++) {
                System.out.print(input + " ");
            }
            System.out.println();
        }
    }
}
