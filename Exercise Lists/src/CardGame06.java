import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardGame06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int firstSize = firstDeck.size();
        int secondSize = secondDeck.size();

        boolean flag = true;

        int counter = 0;
        while (firstSize != 0 && secondSize != 0) {
            int firstHand = (firstDeck.get(0));
            int secondHand = secondDeck.get(0);

            if (firstHand > secondHand) {
                firstDeck.add(firstHand);
                firstDeck.add(secondHand);

                firstDeck.remove(0);
                secondDeck.remove(0);

            } else if (firstHand < secondHand) {
                secondDeck.add(secondHand);
                secondDeck.add(firstHand);

                secondDeck.remove(0);
                firstDeck.remove(0);
            } else {
                firstDeck.remove(0);
                secondDeck.remove(0);
            }
            counter++;
            firstSize = firstDeck.size();
            secondSize = secondDeck.size();
        }

        int sum = 0;
        if (firstDeck.size() > secondDeck.size()) {
            for (Integer number : firstDeck) {
                sum += number;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (Integer number : secondDeck) {
                sum += number;
            }
            System.out.printf("Second player wins! Sum: %d", sum);

        }

    }
}
