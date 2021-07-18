import java.util.Scanner;

public class MaxSequence_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int currentLenght = 1;
        int bestLenght = 0;
        int digit = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            int number = numbers[i];
            int nextNumber = numbers[i + 1];

            if (number == nextNumber) {
                currentLenght++;
                if (currentLenght > bestLenght) {
                    bestLenght = currentLenght;
                    digit = number;
                }
            } else {
                currentLenght = 1;
            }
        }
        for (int i = 0; i < bestLenght ; i++) {
            System.out.print(digit + " ");
        }
    }
}
