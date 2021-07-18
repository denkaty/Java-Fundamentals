import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bannedWord = scanner.nextLine();
        String text = scanner.nextLine();

        while (text.contains(bannedWord)){
            text = text.replace(bannedWord,"");
        }
        System.out.println(text);
    }
}
