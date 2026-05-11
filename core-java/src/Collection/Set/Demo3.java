package Collection.Set;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Demo3 {
    public static void main(String[] args){
        Set<Integer> set =new TreeSet<>();
        set.add(12);
        set.add(9);
        set.add(1);
        System.out.println(set);

        System.out.println(set.contains(12));

    }

}
