public class fourthMain {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        String[] numbersString = new String[numbers.length];
        for (int i = 0; i < numbersString.length; i++) {
            numbersString[i] = String.valueOf(numbers[i]);
        }
        String join = String.join("-", numbersString);
        System.out.println(join);

    }
}
