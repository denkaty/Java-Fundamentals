import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstN = scanner.nextLine();
        String secondN = scanner.nextLine();

        String[] firstArrayString = firstN.split(" ");
        int[] firstArray = new int[firstArrayString.length];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = Integer.parseInt(firstArrayString[i]);
        }

        String[] secondArrayString = secondN.split(" ");
        int[] secondArray = new int[secondArrayString.length];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = Integer.parseInt(secondArrayString[i]);
        }

        int maxLenght = 0;
        if (firstArray.length == secondArray.length) {
            maxLenght = firstArray.length;
        }
        int arraySumm = 0;
        boolean isTrue = false;

        for (int i = 0; i < maxLenght; i++) {
            if (firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isTrue = true;
                break;
            } else {
                arraySumm += firstArray[i];
            }
        }
        if (!isTrue) {
            System.out.printf("Arrays are identical. Sum: %d", arraySumm);
        }
    }
}
