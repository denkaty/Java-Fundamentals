import java.util.Scanner;

public class sixthMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] numbersString = n.split(" ");
        int[] numbers = new int[numbersString.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
