import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        String firstN = scanner.nextLine();
        String secondN = scanner.nextLine();

        String[] firstArray = firstN.split(" ");
        int[] first = new int[firstArray.length];
        for (int i = 0; i < first.length; i++) {
            first[i] = Integer.parseInt(firstArray[i]);
        }

        String[] secondArray = secondN.split(" ");
        int[] second = new int[secondArray.length];
        for (int i = 0; i < second.length; i++) {
            second[i] = Integer.parseInt(secondArray[i]);
        }
        boolean isTrue = false;

        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                sum += first[i];
            } else {
                isTrue = true;
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                break;
            }
        }
        if (!isTrue){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
