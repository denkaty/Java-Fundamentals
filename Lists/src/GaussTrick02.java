import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        List<Integer> newNumbers = new ArrayList<>();

        int i = 0;
        int size = numbers.size();
        while (i < size / 2) {
            int first = numbers.get(i);
            int last = numbers.get(numbers.size() - 1);
            int result = first + last;

            numbers.set(i, result);
            numbers.remove(numbers.size()-1);

            newNumbers.add(result);


            i++;
        }

        printList(numbers);
    }

    private static void printList(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
