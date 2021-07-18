import java.util.*;

public class SoftUniParking_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> car = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s");
            String command = tokens[0];
            String user = tokens[1];

            if (command.equals("register")) {
                String plateNumber = tokens[2];

                if (!car.containsKey(user)) {
                    car.put(user, plateNumber);
                    System.out.printf("%s registered %s successfully%n", user, plateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                }
            } else {
                if (car.containsKey(user)) {
                    System.out.printf("%s unregistered successfully%n", user);
                    car.remove(user);
                } else {
                    System.out.printf("ERROR: user %s not found%n", user);
                }
            }

        }

        car
                .forEach((k, v) -> System.out.printf("%s => %s%n", k, v));
    }
}
