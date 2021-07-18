import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourthMain {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, -2, 4, 20, 42, 35));

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
                i--;
            }
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }


    }
}
