package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Set <Object>set=new HashSet<>() ;
        set.add(12);
        set.add("Hello");
        set.add('S');
        set.add(null);
        System.out.println(set);


    }
}
