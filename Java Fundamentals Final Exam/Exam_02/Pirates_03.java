package Exam_02;

import java.util.*;

public class Pirates_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        Map<String, int[]> towns = new LinkedHashMap<>();
        while (!firstInput.equals("Sail")) {
            String[] tokens = firstInput.split("\\|+");

            String targetedTown = tokens[0];
            int population = Integer.parseInt(tokens[1]);
            int gold = Integer.parseInt(tokens[2]);

            towns.putIfAbsent(targetedTown, new int[2]);
            towns.get(targetedTown)[0] += population;
            towns.get(targetedTown)[1] += gold;

            firstInput = scanner.nextLine();
        }

        String secondInput = scanner.nextLine();
        while (!secondInput.equals("End")) {
            String[] tokens = secondInput.split("=>");
            String command = tokens[0];
            if (command.equals("Plunder")) {
                String attackedTown = tokens[1];
                int killedPeople = Integer.parseInt(tokens[2]);
                int stolenGold = Integer.parseInt(tokens[3]);

                if (killedPeople < 0 || stolenGold < 0) {
                    System.out.println();
                }

                towns.get(attackedTown)[0] -= killedPeople;
                towns.get(attackedTown)[1] -= stolenGold;

                System.out.println(String.format("%s plundered! %d gold stolen, %d citizens killed.",
                        attackedTown, stolenGold, killedPeople));

                if (towns.get(attackedTown)[0] <= 0 || towns.get(attackedTown)[1] <= 0) {
                    towns.remove(attackedTown);
                    System.out.println(String.format("%s has been wiped off the map!", attackedTown));
                }
            } else if (command.equals("Prosper")) {
                String town = tokens[1];
                int goldIncrease = Integer.parseInt(tokens[2]);

                if (goldIncrease < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    towns.get(town)[1] += goldIncrease;
                    System.out.println(String.format("%d gold added to the city treasury. %s now has %d gold.",
                            goldIncrease, town, towns.get(town)[1]));
                }
            }
            secondInput = scanner.nextLine();
        }
        if (towns.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.println(String.format("Ahoy, Captain! There are %d wealthy settlements to go to:", towns.size()));
            towns.entrySet()
                    .stream()
                    .sorted((left, right) -> {
                        if (right.getValue()[1] == left.getValue()[1]) {
                            return left.getKey().compareTo(right.getKey());
                        }
                        return Integer.compare(right.getValue()[1], left.getValue()[1]);
                    })
                    .forEach(town -> System.out.println(String.format("%s -> Population: %d citizens, Gold: %d kg",
                            town.getKey(), town.getValue()[0], town.getValue()[1])));
        }
    }
}