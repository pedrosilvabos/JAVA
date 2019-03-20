package Queue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> groceryLine = new PriorityQueue<String>();
        groceryLine.offer("Marie");
        groceryLine.offer("Ariana");
        groceryLine.offer("Pedro");
        groceryLine.offer("Alice");

        System.out.println(groceryLine);
        System.out.println(groceryLine.peek() + " is the one with the highest priority");
        groceryLine.poll();

        System.out.println(groceryLine);
        System.out.println(groceryLine.peek() + " is the one with the highest priority");
    }
}
