import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] string = scanner.nextLine().split(" ");
        int[] input = new int[string.length];
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(string[i]);
        }

        for (int i = 0; i < input.length - 1; i++) {
            int number = input[i];
            boolean flag = true;

            for (int g = i + 1; g < input.length; g++) {
                int nextNumber = input[g];
                if (number <= nextNumber) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(input[i] + " ");
            }
        }
        System.out.println(input[input.length - 1]);
    }
}
