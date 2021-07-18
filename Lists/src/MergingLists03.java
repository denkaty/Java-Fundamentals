import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split(" ");
        String[] secondInput = scanner.nextLine().split(" ");

        List<Integer> firstList = new ArrayList<>();
        for (int i = 0; i < firstInput.length; i++) {
            firstList.add(Integer.parseInt(firstInput[i]));
        }

        List<Integer> secondList = new ArrayList<>();
        for (int i = 0; i < secondInput.length; i++) {
            secondList.add(Integer.parseInt(secondInput[i]));
        }

        List<Integer> resultList = new ArrayList<>();
        int maxLength = Math.max(firstList.size(), secondList.size());

        for (int i = 0; i < maxLength; i++) {
            if (i < firstList.size()) {
                resultList.add(firstList.get(i));
            }
            if (i<secondList.size()) {
                resultList.add(secondList.get(i));
            }
        }
        for (Integer integer : resultList) {
            System.out.print(integer + " ");
        }

    }
}