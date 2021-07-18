import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = "";
        while (!"course start".equals(command = scanner.nextLine())) {
            String[] tokens = command.split(":");
            command = tokens[0];
            String lessontitle = tokens[1];

            switch (command) {
                case "Add":
                    if (!input.contains(lessontitle)) {
                        input.add(lessontitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);

                    if (!input.contains(lessontitle)) {
                        if (index >= 0 && index < input.size()) {
                            input.add(index, lessontitle);
                        }
                    }
                    break;
                case "Remove":
                    input.remove(lessontitle);

                    String exercise = lessontitle + "-Exercise";
                    input.remove(exercise);
                    break;
                case "Swap":
                    String swapLessonWith = tokens[2];

                    String exOne = lessontitle + "-Exercise";
                    String exTwo = swapLessonWith + "-Exercise";
                    if (input.contains(lessontitle) && input.contains(swapLessonWith)) {
                        int firstElementIndex = input.indexOf(lessontitle);
                        int secondElementIndex = input.indexOf(swapLessonWith);
                        input.set(firstElementIndex, swapLessonWith);
                        input.set(secondElementIndex, lessontitle);
                        if (input.contains(exOne)) {
                            input.remove(input.indexOf(exOne));
                            input.add(input.indexOf(lessontitle + 1), exOne);
                        }
                        if (input.contains(exTwo)) {
                            input.remove(input.indexOf(exTwo));
                            input.add(input.indexOf(swapLessonWith) + 1, exTwo);
                        }
                    }
                    break;
                case "Exercise":
                    if (!input.contains(lessontitle)) {
                        input.add(lessontitle);
                        input.add(lessontitle + "-Exercise");
                    }
                    if (input.contains(lessontitle) && !input.contains(lessontitle + "-Exercise")) {
                        input.add(input.indexOf(lessontitle) + 1, lessontitle + "-Exercise");
                    }
                    break;
            }
        }

        for (int i = 0; i < input.size(); i++) {
            System.out.printf("%s.%s%n", i + 1, input.get(i));
        }
    }
}