import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int splashIndex = input.lastIndexOf('\\');
        int pointIndex = input.lastIndexOf('.');

        String fileName = input.substring(splashIndex + 1, pointIndex);
        String fileExtension = input.substring(pointIndex + 1);

        System.out.println(String.format("File name: %s", fileName));
        System.out.println(String.format("File extension: %s", fileExtension));

    }
}
