import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        String[] things = {"apples", "noobs", "pwnge", "bacon", "goATS"};
        List<String> list1 = new LinkedList<String>();

        for (String x : things) {
            list1.add(x);
        }
        String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
        List<String> list2 = new LinkedList<String>();

        for (String y : things2) {
            list2.add(y);
        }
    //combine list2 to list 1 and canceled list2
        list1.addAll(list2);
        list2 = null;

        printMe(list1);
        removeStuff(list1, 2, 5);
        reverseMe(list1);

    }

    //reverse the list
    private static void reverseMe(List<String> list1) {
        System.out.println("reversing");
        ListIterator<String> iterator = list1.listIterator(list1.size());
        while (iterator.hasPrevious()) {
            System.out.println(" " + iterator.previous());
        }
    }

    //erase method
    private static void removeStuff(List<String> list1, int from, int to) {
        list1.subList(from, to).clear(); //remove it
    }

    //print me method
    private static void printMe(List<String> list1) {
        System.out.println("print me: ");
        for (String b : list1) {
            System.out.println(b + "\n");
        }
    }
}