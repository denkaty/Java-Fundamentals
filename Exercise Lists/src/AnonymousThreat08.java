import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class AnonymousThreat08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String[] tokens = scanner.nextLine().split("\\s+");
        String command = tokens[0];


        while (!command.equals("3:1")) {
            if (command.equals("merge")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                } else if (startIndex > input.size()) {
                    startIndex = input.size() - 2;
                }
                if (endIndex >= input.size()) {
                    endIndex = input.size() - 1;
                }

                String result = "";
                for (int i = startIndex; i <= endIndex; i++) {
                    result += input.get(i);
                }
                input.set(startIndex, result);
                for (int i = endIndex; i > startIndex; i--) {
                    input.remove(i);
                }
            }
            if (command.equals("divide")) {
                int index = Integer.parseInt(tokens[1]);
                int partition = Integer.parseInt(tokens[2]);

                List<String> newList = new ArrayList<>();

                String element = input.get(index);
                if (element.length() % partition == 0) {
                    int portionLenght = element.length() / partition;
                    int count = 0;

                    for (int i = 0; i < partition; i++) {
                        String concat = "";
                        for (int j = 0; j < portionLenght; j++) {
                            char symbol = element.charAt(count);
                            concat += symbol;
                            count++;
                        }
                        newList.add(concat);
                    }
                } else {
                    int portionLenght = element.length() / partition;  //abcde
                    int count = 0;
                    for (int i = 0; i < partition; i++) {
                        String concat = "";

                        if (i != partition - 1) {
                            for (int j = 0; j < portionLenght; j++) {
                                char symbol = element.charAt(count);
                                concat += symbol;
                                count++;
                            }
                        } else {
                            for (int j = count; j < element.length(); j++) {
                                char symbol = element.charAt(count);
                                concat += symbol;
                                count++;
                            }
                        }
                        newList.add(concat);
                    }

                }
                input.remove(index);
                input.addAll(index, newList);
            }
            tokens = scanner.nextLine().split("\\s+");
            command = tokens[0];
        }
        System.out.println(input.toString().replaceAll("[\\[\\],]", ""));
    }
}
