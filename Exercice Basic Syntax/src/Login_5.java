import java.util.Scanner;

public class Login_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }
        boolean isLogged = false;

        for (int b = 1; b <= 4; b++) {
            String input = scanner.nextLine();
            if (input.equals(password)) {
                isLogged = true;
                System.out.printf("User %s logged in.%n", username);
                break;
            }
            if (b <= 3) {
                System.out.printf("Incorrect password. Try again.%n");
            }
        }
        if (!isLogged) {
            System.out.printf("User %s blocked!%n", username);
        }
    }
}