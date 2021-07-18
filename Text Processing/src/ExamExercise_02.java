import java.util.Scanner;

public class ExamExercise_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationalKey = scanner.nextLine();

        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(activationalKey);
        while (!input.equals("Generate")) {
            String[] tokens = input.split(">>>");
            String command = tokens[0];

            if (command.equals("Contains")) {
                String substring = tokens[1];
                int index = sb.indexOf(substring);

                if (index >= 0) {
                    System.out.println(String.format("%s contains %s", sb, substring));
                } else {
                    System.out.println("Substring not found!");
                }

            } else if (command.equals("Flip")) {
                String direction = tokens[1];
                int startIndex = Integer.parseInt(tokens[2]);
                int endIndex = Integer.parseInt(tokens[3]);

                if (direction.equals("Upper")) {
                    String substring = sb.substring(startIndex, endIndex).toUpperCase();
                    sb.replace(startIndex, endIndex, substring);
                } else {
                    String substring = sb.substring(startIndex, endIndex).toLowerCase();
                    sb.replace(startIndex, endIndex, substring);
                }

                System.out.println(sb);
            } else if (command.equals("Slice")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);

                sb.delete(startIndex, endIndex);
                System.out.println(sb);
            }

            input = scanner.nextLine();
        }
        System.out.println(String.format("Your activation key is: %s",sb));
    }
}
