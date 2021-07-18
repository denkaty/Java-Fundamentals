import java.util.Scanner;

public class MaxSequence_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] string = scanner.nextLine().split(" ");
        int[] input = new int[string.length];
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(string[i]);
        }

        int currentLength = 1;
        int bestLength = 0;
        int index = 0;

        for (int i = 0; i < input.length-1; i++) {
            int firstNumber = input[i];
            int secondNumber = input[i + 1];

            if (firstNumber == secondNumber) {
                currentLength++;

                if (currentLength > bestLength) {
                    bestLength = currentLength;
                    index = firstNumber;
                }
            }else {
                currentLength = 1;
            }
        }
        for (int i = 0; i < bestLength; i++) {
            System.out.print(index + " ");
        }


//        String[] string = scanner.nextLine().split(" ");
//        int[] numbers = new int[string.length];
//        for (int i = 0; i < numbers.length ; i++) {
//            numbers[i] = Integer.parseInt(string[i]);
//        }
//
//        int currentLength = 1;
//        int bestLength = 0;
//        int didigt = 0;
//
//        for (int i = 0; i <numbers.length-1 ; i++) {
//            int number = numbers[i];
//            int nextNumber = numbers[i+1];
//
//            if (number == nextNumber) {
//                currentLength++;
//                if (currentLength > bestLength){
//                    bestLength = currentLength;
//                    didigt = number;
//                }
//            }
//            else {
//                currentLength = 1;
//            }
//        }
//        for (int i = 0; i < bestLength ; i++) {
//            System.out.print(didigt + " ");
//        }
    }
}
