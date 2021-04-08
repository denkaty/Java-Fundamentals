package Exam_02;

import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String digitRegex = "(?<digit>\\d)";
        String emojiRegex = "([\\:]{2}|[\\*]{2})([A-Z][a-z]{2,})(\\1)";

        BigDecimal thresholdSum = new BigDecimal(1);
        Pattern digitPattern = Pattern.compile(digitRegex);
        Matcher digitMatcher = digitPattern.matcher(text);
        while (digitMatcher.find()) {
            int digit = Integer.parseInt(digitMatcher.group("digit"));
            thresholdSum = thresholdSum.multiply(BigDecimal.valueOf(digit));
        }

        Pattern emojiPattern = Pattern.compile(emojiRegex);
        Matcher emojiMatcher = emojiPattern.matcher(text);
        Map<String, BigDecimal> emojis = new LinkedHashMap<>();
        int emojiCount = 0;
        while (emojiMatcher.find()) {
            emojiCount++;
            String emoji = emojiMatcher.group();
            BigDecimal emojiCoolness = new BigDecimal(0);
            for (int i = 0; i < emoji.length(); i++) {
                char currentChar = emoji.charAt(i);
                if (Character.isLetter(currentChar)) {
                    emojiCoolness = emojiCoolness.add(BigDecimal.valueOf((int) currentChar));
                }
            }

            int value = thresholdSum.compareTo((emojiCoolness));
            if (value < 0) {
                emojis.put(emoji, emojiCoolness);
            }
        }

        System.out.println(String.format("Cool threshold: %s", thresholdSum));
        System.out.println(String.format("%d emojis found in the text. The cool ones are:", emojiCount));
        emojis.entrySet()
                .stream()
                .forEach(emoji -> System.out.println(emoji.getKey()));
    }
}
