import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesAndReverse07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        numbers.removeIf(n -> n < 0);
        Collections.reverse(numbers);

        if (numbers.size() == 0) {
            System.out.print("empty");
        } else {
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }

        }

    }
}
