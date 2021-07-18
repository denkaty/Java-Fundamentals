import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = "";
        while (!"end".equals(input = scanner.nextLine())) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            if (command.equals("Delete")) {
                int element = Integer.parseInt(tokens[1]);
                while (numbers.contains(element)) {
                    numbers.remove((Integer)element);
                }
            } else if (command.equals("Insert")){
                int number = Integer.parseInt(tokens[1]);
                int position =Integer.parseInt(tokens[2]);
                if (position >= 0 && position < numbers.size()){
                    numbers.add(position,number );
                }
            }
        }
        printList(numbers);
    }

    private static void printList(List<Integer> numbers) {
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
