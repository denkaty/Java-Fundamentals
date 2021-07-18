import java.util.*;

public class Courses_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> lecture = new LinkedHashMap<>();
        while (!command.equals("end")) {
            String[] tokens = command.split(" : ");
            String lectureType = tokens[0];
            String registeredStudent = tokens[1];


            if (!lecture.containsKey(lectureType)) {
                List<String> students = new ArrayList<>();
                students.add(registeredStudent);
                lecture.put(lectureType, students);
            } else {
                List<String> students = lecture.get(lectureType);
                students.add(registeredStudent);
                lecture.put(lectureType, students);
                Collections.sort(students);
            }

            command = scanner.nextLine();
        }
        lecture
                .entrySet()
                .stream()
                .sorted((left, right) -> Integer.compare(right.getValue().size(), left.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("%s: %s%n", entry.getKey(), entry.getValue().size());
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        System.out.printf("-- %s%n", entry.getValue().get(i));
                    }
                });

    }
}
