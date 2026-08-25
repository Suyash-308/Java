package DSA;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray2 {
    public static void main(String[] args) {
        int[] arr={12,43,65,77,97,35,23,35,65};

        Set<Integer> set=new HashSet<>();
        Set<Integer> duplicate=new HashSet<>();

        for (int a : arr){
         if (!set.add(a)){
             duplicate.add(a);
         }
        }
        System.out.println(duplicate);

    }
}
