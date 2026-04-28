package Collection;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("JavaScript");

        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("Java");
        arrayList1.add("Python");

        arrayList.removeAll(arrayList1);
        System.out.println(arrayList);

        System.out.println( arrayList.isEmpty());



    }
}
