import java.util.ArrayList;
import java.util.List;

public class secondMain {

    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();      // "List" -> това е class; "string", "integers", "secondString" -> това са objects
        List<String> secondString = new ArrayList<>();   // ".add", ".remove" -> това са "methods"
                                                         // Objects са нещо по-обемно (имат например ".name", ".age", ".add" и т.н...

        string.add("First");
        integers.add(10);
        secondString.add("secondString");


    }
}
