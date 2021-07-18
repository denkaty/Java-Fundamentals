import java.util.Scanner;

public class Grade_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        printCorrespondingGrade(grade);
    }

    public static void printCorrespondingGrade(double input) {
        String gradeInWords = "";

        if (input >= 2.00 && input <= 2.99) {
            gradeInWords = "Fail";
        } else if (input >= 3.00 && input <= 3.49) {
            gradeInWords = "Poor";
        } else if (input >= 3.5 && input <= 4.49) {
            gradeInWords = "Good";
        } else if (input >= 4.50 && input <= 5.49) {
            gradeInWords = "Very good";
        } else if (input >= 5.50 && input <= 6.00) {
            gradeInWords = "Excellent";
        }

        System.out.println(gradeInWords);
    }
}
