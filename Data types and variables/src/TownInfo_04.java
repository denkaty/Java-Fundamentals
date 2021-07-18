import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        String population = scanner.nextLine();
        String area = scanner.nextLine();

        System.out.printf("Town %s has population of %s and area %s square km.",city,population,area);
    }
}
