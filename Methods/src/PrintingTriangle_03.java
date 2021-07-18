import java.util.Scanner;

public class PrintingTriangle_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLines = Integer.parseInt(scanner.nextLine());

        printTriangle(maxLines);

    }

    public static void printTriangle(int maxLines){
        printTopHalf(maxLines);
        printBottomHalf(maxLines - 1);
    }

    public static void printTopHalf(int numberOfRows){
        for (int i = 1; i <= numberOfRows ; i++) {
            printNumbers(1, i);
        }
    }

    public static void printBottomHalf(int maxLength){
        for (int i = maxLength; i >= 1 ; i--) {
            printNumbers(1,i);
        }
    }

    public static void printNumbers(int from, int to){
        for (int i = from; i <= to ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
