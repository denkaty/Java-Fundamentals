import java.util.Scanner;

public class ReverseAnArrayOfString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] letters = n.split(" ");
        for (int i = 0; i < letters.length / 2; i++) {
            int oppositeIndex = letters.length - 1 - i;
            String oldNumber = letters[i];
            letters[i] = letters[oppositeIndex];
            letters[oppositeIndex] = oldNumber;
        }
        System.out.println(String.join(" ",letters));
    }
}
