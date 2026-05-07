package Collection.Queue;

import java.io.FilterOutputStream;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo2 {
    public static void main(String[] args){
        Queue <String> queue=new PriorityQueue<>();
        queue.add("Hello");
        queue.add("World");
        System.out.println(queue);
    }
}
