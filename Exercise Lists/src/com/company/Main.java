package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfWagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacityInWagon = Integer.parseInt(scanner.nextLine());

        String[] tokens = scanner.nextLine().split(" ");
        String command = tokens[0];

        while (!"end".equals(command)) {
            if ("Add".equals(command)) {
                int addWagon = Integer.parseInt(tokens[1]);
                listOfWagons.add(addWagon);
            } else {
                int passangersToAdd = Integer.parseInt(tokens[0]);

                for (int i = 0; i < listOfWagons.size(); i++) {
                    int freeSpaceLeft = maxCapacityInWagon - listOfWagons.get(i);
                    if (freeSpaceLeft >= passangersToAdd) {
                        listOfWagons.set(i, listOfWagons.get(i) + passangersToAdd);
                        break;
                    }

                }
            }
            tokens = scanner.nextLine().split(" ");
            command = tokens[0];
        }
        for (Integer integer : listOfWagons) {
            System.out.print(integer + " ");
        }

    }
}
