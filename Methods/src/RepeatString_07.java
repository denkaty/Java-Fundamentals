import java.util.Scanner;

public class RepeatString_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldString = scanner.nextLine();
        int repeatCounter = Integer.parseInt(scanner.nextLine());

        String newString = repeatStringNTimes(oldString, repeatCounter);
        System.out.println(newString);
    }

    public static String repeatStringNTimes(String oldString, int repeatCounter) {
        String result = "";

        for (int i = 0; i < repeatCounter; i++) {
            result = result + oldString;
        }
        return result;
    }
}
