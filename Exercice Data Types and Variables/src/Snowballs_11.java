import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); //number of snowballs
        long MAX = Long.MIN_VALUE;

        int snowballSnowEnd = 0;
        int smpwballTimeEnd = 0;
        int snowballQualityEnd = 0;
        long snowballValueEnd = 0;

        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            int formula = (snowballSnow / snowballTime);
            long snowballValue = (long) Math.pow(formula, snowballQuality);

            if (snowballValue >= MAX) {
                MAX = snowballValue;
                snowballSnowEnd = snowballSnow;
                smpwballTimeEnd = snowballTime;
                snowballQualityEnd = snowballQuality;
                snowballValueEnd = snowballValue;
            }
        }
        System.out.printf("%d : %d = %d (%d)",
                snowballSnowEnd, smpwballTimeEnd, snowballValueEnd, snowballQualityEnd);
    }
}
