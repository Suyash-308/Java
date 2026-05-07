package Collection.Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo1 {
    public static void main(String[] args){
        Queue<Integer> queue=new PriorityQueue<>();
        queue.add(19);
        queue.add(67);
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
