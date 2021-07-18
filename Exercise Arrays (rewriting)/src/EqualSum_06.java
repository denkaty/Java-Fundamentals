import java.util.Scanner;

public class EqualSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] string = scanner.nextLine().split(" ");
        int[] input = new int[string.length];
        for (int i = 0; i < input.length; i++) {
            input[i]= Integer.parseInt(string[i]);
        }

        boolean flag = false;
        int index = 0;
        for (int i = 0; i < input.length; i++) {

            int leftSum = 0;
            for (int g = 0; g <i ; g++) {
                leftSum+=input[g];
            }
            int rightSum = 0;
            for (int h = i+1; h < input.length ; h++) {
                rightSum+=input[h];
            }
            if (leftSum == rightSum) {
                flag = true;
                index = i;
                break;
            }
        }
        if (flag) {
            System.out.println(index);
        }else {
            System.out.println("no");
        }

    }
}
