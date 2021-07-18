import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> guestsList = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            String comingOrNot = tokens[2];

            if (comingOrNot.equals("going!")) {
                if (guestsList.contains(name)) {
                    System.out.println(name +" is already in the list!");
                } else {
                    guestsList.add(name);
                }

            } else {
                if (guestsList.contains(name)) {
                    guestsList.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        printGuests(guestsList);
    }

    private static void printGuests(List<String> guestsList) {
        for (String name : guestsList) {
            System.out.println(name);
        }

    }
}
