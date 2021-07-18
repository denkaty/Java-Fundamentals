import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class thirdMain {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, -2, 4, 20, 42, 35));

        int i = 0;
        while (i < numbers.size()) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
            } else {
                i++;
            }
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }


    }
}
