import java.util.Scanner;

public class thirdMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = {"1", "2", "3", "4", "5", "6"};

        String joined = String.join(",", input);
        System.out.println(joined);
    }
}
