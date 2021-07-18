import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> matchedPhoneNumbers = new ArrayList<>();

        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\+359([ \\-])([2])(\\1)([\\d]{3})(\\1)([\\d]{4})\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String number = matcher.group();
            matchedPhoneNumbers.add(number);
        }
        System.out.println(String.join(", ", matchedPhoneNumbers));
    }
}
