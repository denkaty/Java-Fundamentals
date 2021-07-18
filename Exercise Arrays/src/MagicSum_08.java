import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <numbers.length-1 ; i++) {
            int numberOne = numbers[i];
            for (int g = i+1; g < numbers.length ; g++) {
                int numberTwo = numbers[g];
                if (numberOne+numberTwo==n){
                    System.out.println(numberOne + " " + numberTwo);
                }
            }
        }
    }
}
