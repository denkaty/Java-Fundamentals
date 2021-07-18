import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstString = scanner.nextLine().split(" ");
        String[] secondString = scanner.nextLine().split(" ");

        String commonElements = "";

        for (int i = 0; i < secondString.length; i++) {
            String wordFromSecondArray = secondString[i];
            for (int g = 0; g < firstString.length; g++) {
                String wordFromFirstArray = firstString[g];
                if (wordFromSecondArray.equals(wordFromFirstArray)) {
                    commonElements = commonElements + wordFromSecondArray + " ";
                }
            }
        }
        System.out.println(commonElements);

    }
}
