public class sixthMain {
    public static void main(String[] args) {


        int[] numbers = {3,2,1};

        int min = numbers[0];

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] <= min){
                min=numbers[i];
            }
        }
        System.out.println(min);

    }
}
