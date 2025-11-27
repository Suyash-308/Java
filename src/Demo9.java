import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Demo9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(9);
        list.add(88);
        list.add(33);

        System.out.println(list.getFirst());

        System.out.println(list.getLast());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int temp : list) {
            System.out.println(temp);
        }
        System.out.println("-- Consumer --");
        Consumer<Integer> consumer = System.out::println;
        list.forEach(consumer);

        System.out.println("-- Iterator --");


        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

            System.out.println("-- List Iterator --");


            ListIterator<Integer> listIterator=list.listIterator();
            while (listIterator.hasNext()){
                System.out.println(listIterator.next());
            }

    }
}
