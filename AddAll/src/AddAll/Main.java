package AddAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //create a string array
        String[] array = {"red", "green", "blue", "cyan", "magenta", "yellow"};
        List<String> list = Arrays.asList(array);

        ArrayList<String> parts = new ArrayList<String>();
        parts.add("Waterpump");
        parts.add("radiator");
        parts.add("tires");
        parts.add("windows");

        //adds array into list
        Collections.addAll(parts, array);

        for (String s : parts) {
            System.out.println(s);
        }

        //finds the number of times something is repeated in a collection
        System.out.println(Collections.frequency(list, "yellow"));

        //disjoint compares collections and returns true if they have nothing in common
        boolean tof = Collections.disjoint(list,parts);
        if(tof){
            System.out.println("The lists have nothing in common");
        }
        else{
            System.out.println("These lists must have something in common!");
        }

    }
}
