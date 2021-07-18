import java.util.Scanner;

public class RectangleArea_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int area = getRectangleArea(width, height);

        System.out.println(area);
    }

    public static int getRectangleArea(int width, int height) {
        return width * height;
    }


}
