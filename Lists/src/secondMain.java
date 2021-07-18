import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class secondMain {

    public static void main(String[] args) {
        List<Integer> inputNumbers = new ArrayList<>(Arrays.asList(1,5,-10,15, 13));

        inputNumbers.set(2, 42);

        for (int i = 0; i < inputNumbers.size() ; i++) {
            System.out.print(inputNumbers.get(i)+" ");
        }

//        for (Integer inputNumber : inputNumbers) {
//            System.out.print(inputNumber + " ");
//        }

    }
}
