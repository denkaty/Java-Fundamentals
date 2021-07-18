import java.util.Scanner;

public class CenturiesToMinutes_09 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int centuries = Integer.parseInt(scanner.nextLine());
        int years = centuries * 100;
        long days = (int) (years * 365.2422);
        long hours = days * 24;
        long minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",
                centuries, years, days, hours, minutes);
    }
}
