import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        This will create an Arraylist from other arrays
        they have to be the same datatype
        */

        String[] things = {"eggs", "bread", "cookies", "pie"};
        String[] morethings = {"bananas","pears","apples"};
        List<String> list = new ArrayList<>();

        //adding array items to list
        for (String x : things) {
            list.add(x);
        }
        //adding array items to list
        for(String y : morethings){
            list.add(y);
        }
        //putting them out
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
