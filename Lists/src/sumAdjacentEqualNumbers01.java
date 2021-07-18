import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumAdjacentEqualNumbers01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersString = scanner.nextLine().split(" ");

        double[] numbers = new double[numbersString.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Double.parseDouble(numbersString[i]);
        }

        List<Double> listNumber = new ArrayList<>();
        for (double number : numbers) {
            listNumber.add(number);
        }

        printFinalResult(listNumber);


    }

    private static void printFinalResult(List<Double> listNumber) {
        for (int i = 0; i < listNumber.size() - 1; i++) {

            double number = listNumber.get(i);
            double nextNumber = listNumber.get(i + 1);

            if (number == nextNumber) {
                listNumber.remove(i+1);
                double newNumber = number + nextNumber;
                listNumber.set(i, newNumber);
                i= -1;
            }
        }

        printResult(listNumber);
    }

    private static void printResult(List<Double> listNumber) {
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (Double integer : listNumber) {
            System.out.print(decimalFormat.format(integer) + " ");
        }

    }
}
