package GenericMethods;

public class Main {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
        printMe(intArray);
        printMe(charArray);
    }

    //generic Method
    private static <T> void printMe(T[] var) {
        for(T t: var){
            System.out.println(t + "\n");
        }
    }
}
