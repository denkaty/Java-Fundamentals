import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        String topInteger = "";

        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }


        for (int i = 0; i < numbers.length-1; i++) {
            boolean isBigger = true;
            int currentNumber = numbers[i];

            for (int g = i + 1; g < numbers.length; g++) {
                int number = numbers[g];
                if (currentNumber <= number) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(currentNumber + " ");
            }
        }
        System.out.print(numbers[numbers.length-1]);

    }
}
