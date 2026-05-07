package Collection.List;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList=new ArrayList<>();
        arrayList.add(23);
        arrayList.add("Hello");
        arrayList.add(8.7);
        System.out.println(arrayList);


        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.getLast());
        System.out.println(arrayList.get(1));

        arrayList.remove(0);
        System.out.println( arrayList);
        arrayList.remove(8.7);
        System.out.println( arrayList);

        ArrayList<Integer> arrayList1=new ArrayList<>();
        arrayList1.add(8);
        arrayList1.add(2);

        arrayList.addAll(arrayList1);
        System.out.println(arrayList);



    }
}
