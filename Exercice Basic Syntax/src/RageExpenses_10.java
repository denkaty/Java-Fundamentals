import java.util.Scanner;

public class RageExpenses_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetTrashed = 0;
        int mousesTrashed = 0;
        int keyboardsTrashed = 0;
        int displaysTrashed = 0;


        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0) {
                headsetTrashed++;
            }
            if (i % 3 == 0) {
                mousesTrashed++;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                keyboardsTrashed++;
            }
        }displaysTrashed = keyboardsTrashed / 2;
        double expenses = (headsetPrice * headsetTrashed) + (mousePrice * mousesTrashed) + (keyboardPrice * keyboardsTrashed) + (displayPrice * displaysTrashed);
        System.out.printf("Rage expenses: %.02f lv.", expenses);
    }
}
