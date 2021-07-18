import java.util.Scanner;

public class ReverseAnArrayofIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        //int[] numbers = {13, 1, 42, 69};  //69, 42, 1, 13

        for (int i = 0; i < numbers.length / 2; i++) {
            int oppositeIndex = numbers.length - 1 - i;
            int oldNumberI = numbers[i];
            numbers[i]=numbers[oppositeIndex];
            numbers[oppositeIndex] = oldNumberI;
        }
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
    }
}
