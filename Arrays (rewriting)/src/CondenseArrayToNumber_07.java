import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        String[] numbersString = n.split(" ");
        int[] nums = new int[numbersString.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numbersString[i]);
        }

        while (nums.length > 1) {
            int[] condensed = new int[nums.length - 1];
            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = nums[i] + nums[i + 1];
            }

            nums = condensed;
        }

        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }

    }
}
