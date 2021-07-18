import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] string = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] input = new int[string.length];
        for (int i = 0; i < input.length ; i++) {
            input[i] = Integer.parseInt(string[i]);
        }

        for (int i = 0; i <input.length-1 ; i++) {
            int firstNumber = input[i];
            for (int g = i+1; g < input.length; g++) {
                int secondNumber = input[g];
                if (firstNumber + secondNumber == n) {
                    System.out.println(firstNumber + " " + secondNumber);
                }
            }
        }


























//        String[] input = scanner.nextLine().split(" ");
//        int[] numbers = new int[input.length];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = Integer.parseInt(input[i]);
//        }
//
//        int n = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < numbers.length-1 ; i++) {
//            int number = numbers[i];
//            for (int g = i+1; g < numbers.length; g++) {
//                int nextNumber = numbers[g];
//                if (number+nextNumber==n){
//                    System.out.println(number + " " + nextNumber);
//                }
//
//            }
//        }
    }
}
