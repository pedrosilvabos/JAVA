package CollectionMethodSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] things = {"apples", "strawberries", "pears", "oranges", "kiwi"};
        List<String> list1 = Arrays.asList(things);

        //sorts alphabetically
        Collections.sort(list1);
        System.out.println(list1);

        //sort alphabetically but reversed
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
    }
}
