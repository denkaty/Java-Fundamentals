import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int bombNumber = tokens.get(0);
        int power = tokens.get(1);
        while (numbers.contains(bombNumber)) {
            int bombIndex = numbers.indexOf(bombNumber);
            int left = Integer.max(0, bombIndex - power); //1 2 2 4  -> 4 - 2 = Starts from index 1 (number 2)
            int right = Integer.min(bombIndex + power, numbers.size() -1 ); //4 2 2 2 9 -> bombIndex + power -> to index 6 (number 2)

            for (int i = right; i >= left ; i--) { //1 2 2 4 2 2 2 9
                numbers.remove(i);
            }

        }
        int sumOfNumbers = 0;
        for (Integer number : numbers) {
            sumOfNumbers+=number;
        }
        System.out.println(sumOfNumbers);

    }
}
