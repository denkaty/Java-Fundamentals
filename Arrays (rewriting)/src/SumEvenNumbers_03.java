import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        int evenSum = -0;
        String[] numbersString = n.split(" ");
        int[] numbers = new int[numbersString.length];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i]%2==0){
                evenSum+=numbers[i];
            }
        }
        System.out.println(evenSum);
    }
}
