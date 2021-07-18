import java.util.Scanner;

public class ExamExercise_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concealedMessage = scanner.nextLine();

        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(concealedMessage);
        while (!input.equals("Reveal")) {
            String[] tokens = input.split(":\\|:");
            String command = tokens[0];

            if (command.equals("InsertSpace")) {
                int index = Integer.parseInt(tokens[1]);

                sb.insert(index, " ");

                System.out.println(sb);
            } else if (command.equals("Reverse")) {
                String substring = tokens[1];
                int index = sb.indexOf(substring);

                if (index >= 0) {
                    sb.delete(index, index + substring.length());
                    String reversedSubstring = new StringBuilder(substring).reverse().toString();

                    sb.append(reversedSubstring);

                    System.out.println(sb);
                } else {
                    System.out.println("error");
                }

            } else if (command.equals("ChangeAll")) {
                String substring = tokens[1];
                String replacement = tokens[2];

                String replaced = sb.toString().replace(substring, replacement);
                sb = new StringBuilder(replaced);

                System.out.println(sb);
            }

            input = scanner.nextLine();
        }
        System.out.println(String.format("You have a new text message: %s", sb));
    }
}