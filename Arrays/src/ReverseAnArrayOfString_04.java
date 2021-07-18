import java.util.Scanner;

public class ReverseAnArrayOfString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //"a b c d e"
        String[] latters = input.split(" ");


        for (int i = 0; i < latters.length / 2; i++) {
            int oppositeIndex = latters.length - 1 - i;
            String oldNumber = latters[i];
            latters[i] = latters[oppositeIndex];
            latters[oppositeIndex] = oldNumber;
        }
        String join = String.join(" ", latters);
        System.out.print(join);
    }
}
