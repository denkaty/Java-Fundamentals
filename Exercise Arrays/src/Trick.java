import java.util.Scanner;

public class Trick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        String[] inputStrinx = input.split(" "input);

        String[] input = scanner.nextLine().split(" ");
        System.out.println(String.join(",", input));
    }
}
