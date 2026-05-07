package Collection.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Set<Object> set=new LinkedHashSet<>() ;
        set.add(12);
        set.add("Hello");
        set.add('S');
        set.add(null);

        System.out.println(set);


    }
}
