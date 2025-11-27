import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        System.out.println(arrayList);
        arrayList.add(10);
        arrayList.add(13);
        arrayList.add(43);
        arrayList.add(55);
        arrayList.add(89);
        arrayList.add(30);

        System.out.println(arrayList);

        ArrayList list=new ArrayList<>();
        list.add(101);
        list.add(123);
        list.add(329);

        arrayList.addAll(list);
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

        ArrayList removalList=new ArrayList();
        removalList.add(10);
        removalList.add(30);

        arrayList.removeAll(removalList);
        System.out.println(arrayList);

        ArrayList retainList=new ArrayList();
        retainList.add(101);
        System.out.println(retainList);



    }
}
