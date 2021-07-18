import java.util.Scanner;

public class thirdMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] numbers = n.split(" ");

//        String[] numbers = {"1", "2", "3", "4", "5", "6"};
        String join = String.join(",", numbers);
        System.out.println(join);
    }
}
