import java.util.Scanner;

public class Orders_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quanity = Integer.parseInt(scanner.nextLine());

        printTotalPrice(product, quanity);
    }

    private static void printTotalPrice(String product, int quanity) {
        double price = 0;
        if (product.equals("coffee")) {
            price = 1.50 * quanity;
        } else if (product.equals("water")) {
            price = 1.0 * quanity;
        } else if (product.equals("coke")) {
            price = 1.40 * quanity;
        } else if (product.equals("snacks")) {
            price = 2.0 * quanity;
        }
        System.out.printf("%.2f", price);
    }

}