import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(20);
        System.out.println(arrayList);

        ArrayList<Integer> list=new ArrayList<>();
        list.add(80);
        list.add(70);
        list.add(20);
        list.add(75);
        list.add(73);
        list.add(7);
        list.add(5);


        arrayList.addAll(list);
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);


        ArrayList<Integer> listRemove=new ArrayList<>();
        listRemove.add(89);
        listRemove.add(70);


        arrayList.removeAll(listRemove);
        System.out.println(arrayList);


        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println(arrayList.get(1));


        System.out.println("Traditional for loop");
        for (int i = 0; i <arrayList.size() ; i++) {
        System.out.println(arrayList.get(i)+" ");
        }


        System.out.println("Enhanced for loop");
        for (int a:arrayList){
            System.out.println(a);
        }


        System.out.println("Consumer");
        Consumer<Integer> consumer=X->System.out.println(X);
        arrayList.forEach(consumer);

        System.out.println("Iterator");
        Iterator<Integer> iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("ListIterator");
        ListIterator<Integer> listIterator=arrayList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }




    }
}
