import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;
        while (!inputNumbers.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            int value = 0;

            if (index < 0) {
                value = inputNumbers.get(0);
                inputNumbers.set(0, inputNumbers.get(inputNumbers.size() - 1));
            } else if (index >= inputNumbers.size()) {
                value = inputNumbers.get(inputNumbers.size() - 1);
                inputNumbers.set(inputNumbers.size() - 1, inputNumbers.get(0));
            } else {
                value = inputNumbers.remove(index);
            }

            sum += value;

            for (int i = 0; i < inputNumbers.size(); i++) {
                int element = inputNumbers.get(i);
                if (element <= value) {
                    inputNumbers.set(i, element + value);
                } else {
                    inputNumbers.set(i, element - value);
                }
            }
        }

        System.out.println(sum);
    }
}