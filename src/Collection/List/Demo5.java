package Collection.List;

import java.util.Collections;
import java.util.Stack;

public class Demo5 {
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();
        stack.push(11);
        stack.push(15);
        stack.push(50);
        stack.push(8);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
       Collections.sort(stack);
        System.out.println(stack);

        System.out.println(stack.peek());

    }
}
