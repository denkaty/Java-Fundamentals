import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (int i = 0; i < secondArray.length; i++) {
            String firstWord = secondArray[i];

            for (int j = 0; j < firstArray.length; j++) {
                String secondWord = firstArray[j];

                if (firstWord.equals(secondWord)){
                    System.out.print(firstWord + " ");
                }
            }
        }
    }
}