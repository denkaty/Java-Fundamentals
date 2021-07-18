import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class randomNumbersFrom5To15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println(random.nextInt(11) + 5);
        System.out.println(random.nextInt(11) + 5);
        System.out.println(random.nextInt(11) + 5);
        System.out.println(random.nextInt(11) + 5);
    }
}
