import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinterTask_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("stop")) {
            String resource = command;
            int quantity = Integer.parseInt(scanner.nextLine());

            resources.putIfAbsent(resource, 0);
            int currentQuantity = resources.get(resource) + quantity;

            resources.put(resource, currentQuantity);

//            if (!resources.containsKey(resource)) {
//                resources.put(resource, quantity);
//            } else {
//                Integer currentQuantity = resources.get(resource);
//                currentQuantity += quantity;
//
//                resources.put(resource, currentQuantity);
//            }

            command = scanner.nextLine();

        }

        resources
                .forEach((k, v) -> System.out.println(String.format("%s -> %s", k, v)));

//        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
//            String resource = entry.getKey();
//            Integer quantity = entry.getValue();
//
//            System.out.printf("%s -> %s%n", resource, quantity);
//        }

    }
}