import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> participants = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        Map<String, Integer> participantsInfo = new LinkedHashMap<>();


        Pattern pattern = Pattern.compile("([A-Za-z0-9])");
        String info = scanner.nextLine();
        while (!info.equals("end of race")) {

            Matcher matcher = pattern.matcher(info);
            StringBuilder result = new StringBuilder();
            while (matcher.find()) {
                result.append(matcher.group());
            }

            StringBuilder name = new StringBuilder();
            int km = 0;
            for (int i = 0; i < result.length(); i++) {
                char currentChar = result.charAt(i);

                if (Character.isAlphabetic(currentChar)) {
                    name.append(currentChar);
                } else {
                    km += Integer.parseInt(String.valueOf(currentChar));
                }
            }

            if (participants.contains(name.toString())) {
                if (!participantsInfo.containsKey(name.toString())) {
                    participantsInfo.put(name.toString(), km);
                } else {
                    participantsInfo.put(name.toString(), participantsInfo.get(name.toString()) + km);
                }
            }

            info = scanner.nextLine();
        }

        List<String> output = new ArrayList<>();
        output.add("1st place: ");
        output.add("2nd place: ");
        output.add("3rd place: ");

        participantsInfo
                .entrySet()
                .stream()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .limit(3)
                .forEach(entry -> {
                    int count = 0;
                    System.out.println(output.remove(0) + entry.getKey());
                });

    }
}
