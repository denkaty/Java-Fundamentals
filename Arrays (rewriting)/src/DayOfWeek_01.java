import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int whichDayNumber = Integer.parseInt(scanner.nextLine());

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (whichDayNumber>= 1 && whichDayNumber<= 7){
            System.out.println(daysOfWeek[whichDayNumber-1]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}
