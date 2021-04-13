package Exam_04;

import java.util.Scanner;

public class PasswordReset_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];

            if (command.equals("TakeOdd")) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 1; i < password.length(); i += 2) {
                    char currentChar = password.charAt(i);
                    stringBuilder.append(currentChar);
                }
                password = stringBuilder.toString();
                System.out.println(password);
            } else if (command.equals("Cut")) {
                int fromIndex = Integer.parseInt(tokens[1]);
                int toIndex = fromIndex + Integer.parseInt(tokens[2]);
                StringBuilder stringBuilder = new StringBuilder(password);
                stringBuilder.delete(fromIndex, toIndex);
                password = stringBuilder.toString();
                System.out.println(password);
            } else if (command.equals("Substitute")) {
                String target = tokens[1];
                String replaceWith = tokens[2];
                if (password.contains(target)) {
                    password = password.replace(target, replaceWith);
                    System.out.println(password);
                }else {
                    System.out.println("Nothing to replace!");
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(String.format("Your password is: %s", password));

    }
}