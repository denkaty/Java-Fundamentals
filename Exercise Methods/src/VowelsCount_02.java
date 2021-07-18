import java.util.Scanner;

public class VowelsCount_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printCountOfVowels(input);
    }

    private static void printCountOfVowels(String input) {
        String[] text = input.split("");
        int counter = 0;

        for (int i = 0; i < text.length; i++) {
            if (text[i].equals("A") || text[i].equals("O") || text[i].equals("U") || text[i].equals("E") || text[i].equals("I") ||
                    text[i].equals("a") || text[i].equals("o") || text[i].equals("u") || text[i].equals("e") || text[i].equals("i")) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
