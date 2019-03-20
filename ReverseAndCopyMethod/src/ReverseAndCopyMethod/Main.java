package ReverseAndCopyMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //create array and convert it to list
        String[] array = {"black", "yellow", "pink", "red", "green", "blue"};
        List<String> list1 = Arrays.asList(array);
        System.out.println("List is: " + list1 + "\n");
        output(list1);

        //reverse and print out the list
        Collections.reverse(list1);
        System.out.println("After reverse: " + list1 + "\n");
        output(list1);

        //create new array and new list
        String[] newArray = new String[array.length];
        List<String> listCopy = Arrays.asList(newArray);

        //copy list1 into listCopy
        Collections.copy(listCopy, list1);
        Collections.reverse(listCopy);
        output(listCopy);

        //fill collection with crap
        Collections.fill(list1, "X");
        System.out.println("After Filling the list: ");
        output(list1);
    }

    //output method
    private static void output(List<String> listCopy) {
        for (String s : listCopy) {
            System.out.printf(s + " ");
        }
        System.out.println("\n");


    }
}
