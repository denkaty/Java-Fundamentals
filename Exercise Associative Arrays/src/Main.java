import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split("\\s"))
                .collect(Collectors.toList());

        Map<Character, Integer> charactersCounts = new LinkedHashMap<>();

        for (String currentWord : words) {
            for (int i = 0; i < currentWord.length() ; i++) {
                char currentChar = currentWord.charAt(i);

                if (!charactersCounts.containsKey(currentChar)){
                    charactersCounts.put(currentChar,1);
                }
                else {
                    Integer currentCounts = charactersCounts.get(currentChar);
                    currentCounts++;

                    charactersCounts.put(currentChar,currentCounts);
                }
            }

        }

        for (Map.Entry<Character, Integer> entry : charactersCounts.entrySet()) {
            Character currentCharacter = entry.getKey();
            Integer characterCounts = entry.getValue();

            System.out.printf("%s -> %s%n",currentCharacter, characterCounts);
        }


    }
}
