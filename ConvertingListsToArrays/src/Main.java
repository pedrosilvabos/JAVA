import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //convert from array to list
        String[] stuff = {"babies", "watermelo", "fudge", "melons"};
        LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));

        thelist.add("pumpkin");
        thelist.addFirst("first thing");

        //convert back to an array
        stuff = thelist.toArray(new String[thelist.size()]);

        for(String x : stuff){
            System.out.println(x);
        }
    }
}
