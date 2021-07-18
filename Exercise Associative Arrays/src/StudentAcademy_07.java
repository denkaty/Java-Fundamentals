import java.util.*;

public class StudentAcademy_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!students.containsKey(name)) {
                List<Double> studentGrades = new ArrayList<>();
                studentGrades.add(grade);
                students.put(name, studentGrades);
            } else {
                List<Double> studentGrades = students.get(name);
                studentGrades.add(grade);
                students.put(name, studentGrades);
            }
        }

        Map<String, Double> nameAndAverageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            double average = entry.getValue().stream().mapToDouble(x -> x).average().getAsDouble();
            if (average >= 4.50) {
                nameAndAverageGrade.put(entry.getKey(), average);
            }
        }

        nameAndAverageGrade
                .entrySet()
                .stream()
                .sorted((x1, x2) -> x2.getValue().compareTo(x1.getValue()))
                .forEach(grade -> System.out.println(String.format("%s -> %.2f", grade.getKey(), grade.getValue())));
//        .forEach(grade-> System.out.printf("%s -> %.2f%n",grade.getKey(), grade.getValue()));
    }
}
