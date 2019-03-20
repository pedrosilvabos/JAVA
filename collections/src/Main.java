import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        This will create an Arraylist from other arrays
        they have to be the same datatype
        */

        String[] things = {"eggs", "bread"};
        List<String> list = new ArrayList<>();

        String[] morethings = {"bananas","bread"};
        List<String> list2 = new ArrayList<>();

        //adding array items to list
        for (String x : things) {
            list.add(x);
        }
        //adding array items to list
        for(String y : morethings){
            list2.add(y);
        }

        editList(list,list2);
        //show the arraylists
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list 1 has: " + list.get(i));
        }
        for (int i = 0; i < list2.size() ; i++) {
            System.out.println("list 2 has: " + list2.get(i));
        }
    }

    private static void editList(Collection<String> list, Collection<String> list2) {
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            if(list2.contains(it.next())){
             it.remove();
            }
        }
    }
}
