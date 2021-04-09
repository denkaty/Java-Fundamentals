package Exam_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Start - 12:00
        String text = scanner.nextLine();

        String locationRegex = "([\\=|\\/])(?<location>[A-Z][A-Za-z]{2,})(\\1)";
        Pattern pattern = Pattern.compile(locationRegex);
        Matcher matcher = pattern.matcher(text);

        List<String> locations = new ArrayList<>();
        int travelPoints = 0;
        while (matcher.find()) {
            String currentLocation = matcher.group("location");
            travelPoints += currentLocation.length();
            locations.add(currentLocation);
        }
        String joinedLocations = String.join(", ", locations);
        System.out.println(String.format("Destinations: %s", joinedLocations));
        System.out.println(String.format("Travel Points: %d", travelPoints));
    }
}
//Finish - 12:20