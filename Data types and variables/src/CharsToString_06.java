import java.util.Scanner;

public class CharsToString_06 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        char one = scanner.next().charAt(0);
        char two = scanner.next().charAt(0);
        char three = scanner.next().charAt(0);
        System.out.printf("%c %c %c",three,two,one);
    }
}
