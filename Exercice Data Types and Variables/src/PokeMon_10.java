import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceBetweenThePokeTargetsM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());

        int targetsCount = 0;
        int pokePower = pokePowerN;

        while (pokePower >= distanceBetweenThePokeTargetsM) {

            pokePower -= distanceBetweenThePokeTargetsM;
            targetsCount++;

            if (pokePower == pokePowerN / 2.0 && exhaustionFactorY != 0) {
                pokePower = pokePower / exhaustionFactorY;
            }
        }
        System.out.println(pokePower);
        System.out.println(targetsCount);
        
    }
}