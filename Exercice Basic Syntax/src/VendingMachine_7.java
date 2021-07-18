import java.util.Scanner;

public class VendingMachine_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalMoneyInserted = 0;

        while (!input.equals("Start")) {
            double coinsInsertedInMachine = Double.parseDouble(input);
            if (coinsInsertedInMachine == 0.1 || coinsInsertedInMachine == 0.2 || coinsInsertedInMachine == 0.5 || coinsInsertedInMachine == 1 || coinsInsertedInMachine == 2) {
                totalMoneyInserted += coinsInsertedInMachine;
            } else {
                System.out.printf("Cannot accept %.2f%n", coinsInsertedInMachine);
            }
            input = scanner.nextLine();
        }
        while (!input.equals("End")) {
            if (input.equals("Start")) {
                input = scanner.nextLine();
            }
            double priceProduct = 0;
            if ("Nuts".equals(input)) {
                priceProduct = 2;
            } else if ("Water".equals(input)) {
                priceProduct = 0.7;
            } else if ("Crisps".equals(input)) {
                priceProduct = 1.5;
            } else if ("Soda".equals(input)) {
                priceProduct = 0.8;
            } else if ("Coke".equals(input)) {
                priceProduct = 1;
            } else {
                System.out.println("Invalid product");
            }
            if (priceProduct == 0) {
                input = scanner.nextLine();
                continue;
            } else if (priceProduct != 0 && priceProduct >= priceProduct) {
                System.out.printf("Purchased %s%n", input);
                totalMoneyInserted -= priceProduct;
            } else {
                System.out.printf("Sorry, not enough money%n");
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoneyInserted);
    }
}
