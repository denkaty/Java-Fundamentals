import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s");
        System.out.println(multiplyCharacters(input[0], input[1]));


    }

    private static int multiplyCharacters(String firstString, String secondString) {
        int shorter = Math.min(firstString.length(), secondString.length());
        int longer = Math.max(firstString.length(), secondString.length());

        int sum = 0;
        for (int i = 0; i < longer; i++) {

            if (i < shorter) {
                char firstChar = firstString.charAt(i);
                char secondChar = secondString.charAt(i);
                sum += firstChar * secondChar;
            } else if (longer == secondString.length()) {
                char currentChar = secondString.charAt(i);
                sum += currentChar;
            } else {
                char currentChar = firstString.charAt(i);
                sum += currentChar;
            }
        }

        return sum;
    }


//    private static int multiplyCharacters(String firstString, String secondString) {
//        char[] firstWord = firstString.toCharArray();
//        char[] secondWord = secondString.toCharArray();
//
//        int shorterWord = Math.min(firstString.length(), secondString.length());
//        int longerWord = Math.max(firstString.length(), secondString.length());
//
//
//        int sum = 0;
//        int tempSum = 0;
//        for (int i = 0; i < shorterWord; i++) {
//            tempSum += firstWord[i] * secondWord[i];
//        }
//        sum += tempSum;
//
//        if (firstWord.length < secondWord.length) { // a aaaa
//
//            for (int i = shorterWord; i < longerWord; i++) {
//                sum += secondWord[i];
//
//            }
//        } else if (secondWord.length < firstWord.length) {
//
//            for (int i = shorterWord; i < longerWord; i++) {
//                sum += firstWord[i];
//
//            }
//        }
//        return sum;
//    }
}
