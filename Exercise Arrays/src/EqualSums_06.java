import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        boolean flag = false;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {

            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum = leftSum + numbers[j];
            }

            int rightSum = 0;
            for (int g = i+1; g < numbers.length; g++) {
                rightSum = rightSum + numbers[g];
            }

            if (leftSum == rightSum) {
                flag = true;
                index = i;
            }
        }
        if (flag){
            System.out.println(index);
        }else {
            System.out.println("no");
        }
    }
}
