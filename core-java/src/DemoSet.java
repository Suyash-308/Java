import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>();

        System.out.println(set);


        set.add(20);
        set.add(90);
        System.out.println(set);

        for (int i : set){
            System.out.println(i);
        }

        set.remove(20);
        System.out.println(set);


        System.out.println(set.contains(90));

    }
}
