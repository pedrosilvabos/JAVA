import java.util.Stack;

public class StackPushPop {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("1st plate");
        PrintStack(stack);
        stack.push("2nd plate");
        PrintStack(stack);
        stack.push("3rd plate");
        PrintStack(stack);

        stack.pop();
        PrintStack(stack);
        stack.pop();
        PrintStack(stack);
        stack.pop();
        PrintStack(stack);
    }

    private static void PrintStack(Stack<String> s){
        if(s.isEmpty()){
            System.out.println("you have nothing in your stack");
            return;
        }
        else{
            System.out.println("TOP" + s);
        }
    }
}
