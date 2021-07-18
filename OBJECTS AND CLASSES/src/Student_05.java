import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_05 { //Student_05

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Student> students = new ArrayList<>();
        while (!line.equals("end")) {
            String[] parts = line.split(" ");


            if (isStudentExisting(students, parts[0], parts[1])) {
                Student student = getStudent(students, parts[0], parts[1]);

                student.setFirstName(parts[0]);
                student.setLastName(parts[1]);
                student.setAge(Integer.parseInt(parts[2]));
                student.setCity(parts[3]);
            } else {
                Student student = new Student(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]);
                students.add(student);
            }

            line = scanner.nextLine();
        }
        String city = scanner.nextLine();

        for (Student student : students) {
            if (city.equals(student.getCity())) {
                System.out.printf("%s %s is %d years old%n",
                        student.getFirstName(),
                        student.getLastName(),
                        student.getAge());
            }
        }
    }

    private static boolean isStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }
}