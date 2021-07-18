import java.util.Scanner;

public class ReverseString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String word = command;

            String reversed = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            System.out.printf("%s = %s%n", word, reversed);

            command = scanner.nextLine();
        }

//        while (!command.equals("end")){
//            String word = command;
//
//            StringBuilder sb = new StringBuilder();
//            for (int i = word.length()-1; i >=0 ; i--) {
//                sb.append(word.charAt(i));
//            }
//            System.out.printf("%s = %s%n", word, sb);
//
//            command = scanner.nextLine();
//        }
    }
}
