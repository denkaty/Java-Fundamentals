import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            String firstLatter = input[0];
            for (int g = 0; g < input.length - 1 ; g++) {
                input[g] = input[g+1];
            }
            input[input.length-1] = firstLatter;
        }
        System.out.println(String.join(" ", input));
    }
}
