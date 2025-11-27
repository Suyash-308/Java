import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args){
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(30);
//        priorityQueue.add(10);
//        priorityQueue.add(14);
//        priorityQueue.add(20);
//        priorityQueue.add(40);
        System.out.println(priorityQueue);
        priorityQueue.remove(30);
        System.out.println(priorityQueue.peek());
    }
}
