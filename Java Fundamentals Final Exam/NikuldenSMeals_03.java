import java.lang.reflect.Array;
import java.util.*;

public class NikuldenSMeals_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> guests = new LinkedHashMap<>();
        int unlikedMeals = 0;
        while (!input.equals("Stop")) {
            String[] tokens = input.split("-");
            String command = tokens[0];
            String guest = tokens[1];
            String meal = tokens[2];
            if (command.equals("Like")) {
                guests.putIfAbsent(guest, new ArrayList<>());
                List<String> likedMeals = guests.get(guest);
                if (!likedMeals.contains(meal)) {
                    likedMeals.add(meal);
                }
                guests.put(guest, likedMeals);
            } else if (command.equals("Unlike")) {
                if (!guests.containsKey(guest)) {
                    System.out.println(String.format("%s is not at the party.", guest));
                } else if (!guests.get(guest).contains(meal)) {
                    System.out.println(String.format("%s doesn't have the %s in his/her collection.", guest, meal));
                } else {
                    unlikedMeals++;
                    System.out.println(String.format("%s doesn't like the %s.", guest, meal));
                    List<String> likedMeals = guests.get(guest);
                    likedMeals.remove(meal);
                    guests.put(guest, likedMeals);
                }
            }
            input = scanner.nextLine();
        }
        guests.entrySet()
                .stream()
                .sorted((left, right) -> {
                    int res = right.getValue().size() - left.getValue().size();
                    if (res == 0) {
                        return left.getKey().compareTo(right.getKey());
                    } else {
                        return res;
                    }
                })
                .forEach(guest -> System.out.println(String.format("%s: %s",
                        guest.getKey(), String.join(", ", guest.getValue()))));

        System.out.println(String.format("Unliked meals: %d", unlikedMeals));
    }
}
