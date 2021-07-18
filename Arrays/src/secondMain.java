import java.util.Scanner;

public class secondMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String[] numbersStrings = {"2", "8", "30", "25"};

        String n = scanner.nextLine(); //// 2, 8, 30, 25 ======= "2", "8", "30", "25"
        String[] numberStrings = n.split(" ");

        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
