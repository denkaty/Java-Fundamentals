import java.util.*;

public class SoftUniExamResults_019 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> results = new HashMap<>();
        Map<String, Integer> submissions = new HashMap<>();
        while (!input.equals("exam finished")) {
            String[] tokens = input.split("-");

            if (tokens[1].equals("banned")) { // pesho banned
                String username = tokens[0];
                if (results.containsKey(username)) {
                    results.remove(username);
                }
            } else { //pesho java 84
                String username = tokens[0];
                String language = tokens[1];
                int points = Integer.parseInt(tokens[2]);

                if (!results.containsKey(username)) {
                    results.put(username, points);
                } else {
                    if (results.get(username) < points) {
                        results.put(username, points);
                    }
                }


                if (!submissions.containsKey(language)) {
                    submissions.put(language, 1);
                } else {
                    submissions.put(language, submissions.get(language) + 1);
                }

            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        results
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(student -> System.out.println(String.format("%s | %d", student.getKey(), student.getValue())));

        System.out.println("Submissions:");
        submissions
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(language -> System.out.println(String.format("%s - %d", language.getKey(), language.getValue())));
    }
}
