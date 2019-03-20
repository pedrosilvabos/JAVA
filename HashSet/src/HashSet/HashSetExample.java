package HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        String[] things = {"Apple", "Bob", "Peter", "banana", "Apple"};

        List<String> list = Arrays.asList(things);
        System.out.println(list + "\n");

        //Hash will no accept duplicats
        Set<String> set = new HashSet<String>(list);
        System.out.println(set);
    }
}