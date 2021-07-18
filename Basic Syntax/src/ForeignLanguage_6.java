import java.util.Scanner;

public class ForeignLanguage_6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String country = scanner.nextLine();

        if (country.equals("England")||country.equals("USA")){
            System.out.printf("English");
        }else if (country.equals("Spain")||country.equals("Argentina")||country.equals("Mexico")){
            System.out.printf("Spanish");
        }else {
            System.out.printf("unknown");
        }
    }
}
