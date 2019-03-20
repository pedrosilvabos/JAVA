package GenericReturnType;

public class Main<T> {
    public static void main(String[] args) {
        System.out.println(max(23,41,22));
        System.out.println(max("Batata","Couve","Nabo"));
    }
    //returns the highest
    public static <T extends Comparable<T>> T max(T a, T b, T c){
        T m = a;
        if(b.compareTo(a) > 0){
            m = b;
        }
        if(c.compareTo(m) > 0){
            m = c;
        }
        return m;
    }
}
