import java.util.*;
import java.util.stream.Collectors;

public class Orders_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Double> orders = new LinkedHashMap<>();
        Map<String, Integer> rememberProduct = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("buy")) {
            String[] tokens = command.split("\\s");

            String product = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            if (!orders.containsKey(product)) {
                orders.put(product, quantity * price);
                rememberProduct.put(product, quantity);
            } else {
                rememberProduct.put(product, rememberProduct.get(product) + quantity);
                orders.put(product, rememberProduct.get(product) * price);
            }
            command = scanner.nextLine();
        }

        orders
                .forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v));


    }
}
