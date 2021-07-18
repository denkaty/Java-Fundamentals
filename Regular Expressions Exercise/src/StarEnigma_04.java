import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StarEnigma_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "@(?<name>[A-Za-z]+)[^@\\-!:>]*?:(?<population>[\\d]+)[^@\\-!:>]*?!(?<attackType>[AD])![^@\\-!:>]*?->(?<soldierCount>[\\d]+)";

        Pattern pattern = Pattern.compile(regex);
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlantets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String message = scanner.nextLine();
            StringBuilder decryptedMessage = new StringBuilder();

            int key = 0;
            for (int g = 0; g < message.length(); g++) {
                char currentChar = message.charAt(g);

                if (currentChar == 's' || currentChar == 't' || currentChar == 'a' || currentChar == 'r'
                        || currentChar == 'S' || currentChar == 'T' || currentChar == 'A' || currentChar == 'R') {
                    key++;
                }
            }


            for (int h = 0; h < message.length(); h++) {
                char currentChar = message.charAt(h);
                int newCharInt = currentChar - key;
                char newChar = (char) newCharInt;

                decryptedMessage.append(newChar);
            }

            Matcher matcher = pattern.matcher(decryptedMessage.toString());


            if (matcher.find()) {
                String name = matcher.group("name");
                int population = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("attackType");
                int soldierCount = Integer.parseInt(matcher.group("soldierCount"));

                if (attackType.equals("A")) {
                    attackedPlanets.add(name);
                } else {
                    destroyedPlantets.add(name);
                }

            }
        }

        Collections.sort(attackedPlanets);
        System.out.println(String.format("Attacked planets: %d", attackedPlanets.size()));
        for (String attackedPlanet : attackedPlanets) {
            System.out.println(String.format("-> %s", attackedPlanet));
        }
        Collections.sort(destroyedPlantets);
        System.out.println(String.format("Destroyed planets: %d", destroyedPlantets.size()));
        for (String destroyedPlantet : destroyedPlantets) {
            System.out.println(String.format("-> %s", destroyedPlantet));
        }

    }
}