package Exam_03;

import java.util.Scanner;

public class WorldTour_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //start 11:30
        String allStops = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            String[] tokens = input.split(":");
            String command = tokens[0];
            if (command.equals("Add Stop")) {
                int index = Integer.parseInt(tokens[1]);
                String string = tokens[2];
                if (index >= 0 && index < allStops.length()) {
                    String firstHalf = allStops.substring(0, index);
                    String secondHalf = string + allStops.substring(index);
                    allStops = firstHalf + secondHalf;
                }
            } else if (command.equals("Remove Stop")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);

                if (startIndex >= 0 && startIndex < allStops.length() && endIndex >= 0 && endIndex < allStops.length()) {
                    String firstHalf = allStops.substring(0, startIndex);
                    String secondHalf = allStops.substring(endIndex + 1);

                    allStops = firstHalf + secondHalf;
                }
            } else if (command.equals("Switch")) {
                String oldString = tokens[1];
                String newString = tokens[2];

                int oldStringIndex = allStops.indexOf(oldString);
                if (oldStringIndex >= 0 && oldStringIndex < allStops.length()) {
                    allStops = allStops.replace(oldString, newString);
                }
            }

            System.out.println(allStops);
            input = scanner.nextLine();
        }
        System.out.println(String.format("Ready for world tour! Planned stops: %s", allStops));
    }
}
//Finished - 12:00