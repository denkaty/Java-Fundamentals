import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        char letter = scanner.next().charAt(0);

        if (letter >= 65 && letter <= 91){
            System.out.println("upper-case");
        }else if (letter >=97 && letter <=122){
            System.out.println("lower-case");
        }
    }
}
