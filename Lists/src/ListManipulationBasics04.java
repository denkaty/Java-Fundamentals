import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationBasics04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        String[] tokens = scanner.nextLine().split(" ");
        String command = tokens[0];
        while (!command.equals("end")) {
            switch (command) {
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = (Integer.parseInt(tokens[1]));
                    numbers.remove((Integer)numberToRemove);
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    numbers.add(index, numberToInsert);
                    break;
            }

            tokens = scanner.nextLine().split(" ");
            command = tokens[0];
        }
        printListt(numbers);
    }

    private static void printListt(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
