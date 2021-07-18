import java.util.*;
import java.util.stream.Collectors;

public class ListOperations04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String[] tokens = scanner.nextLine().split("\\s+");
        String command = "";

        while (!"End".equals(command=tokens[0])) {
            if (command.equals("Add")) {
                int number = Integer.parseInt(tokens[1]);
                numbers.add(number);
            } else if (command.equals("Insert")) {
                int number = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.equals("Remove")) {
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.equals("Shift")) {
                String positionToShift = tokens[1];
                int count = Integer.parseInt(tokens[2]);

                if (positionToShift.equals("left")) {
                    //first number becomes last (countTimes)
                    for (int i = 0; i < count; i++) {
                        numbers.add(numbers.get(0));
                        numbers.remove(0);


                    }
//                    for (int i = 0; i < count; i++) {
//                        int firstNumber = numbers.get(0);
//                        for (int j = 0; j < numbers.size() - 1; j++) {
//                            numbers.set(j, numbers.get(j + 1));
//                        }
//                        numbers.set(numbers.size() - 1, firstNumber);
//                    }
                } else {
                    for (int i = 0; i < count; i++) {
                        numbers.add(0, numbers.get(numbers.size() - 1));
                        numbers.remove(numbers.size() - 1);

                    }
                }
            }

            tokens = scanner.nextLine().split("\\s+");
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
