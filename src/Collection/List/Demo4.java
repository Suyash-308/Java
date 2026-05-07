package Collection.List;

import java.util.LinkedList;

public class Demo4 {
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1,25);
        System.out.println(list);

    }
}
