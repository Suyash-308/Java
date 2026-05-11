package Recursion;

import java.util.HashSet;

public class Recursion13 {
    public static void subSequence(String str, int i, String newStr, HashSet<String> set){
        if (i==str.length()){
             if (set.contains(newStr)){
                 return;
             }else {
                 System.out.println(newStr);
                 set.add(newStr);
                 return;
             }

        }
        char currentChar=str.charAt(i);
        subSequence(str,i+1,newStr+currentChar, set);

        subSequence(str,i+1,newStr, set);

    }

    static void main() {
        String str="aaa";
        HashSet <String> set=new HashSet<>();
        subSequence(str,0,"",set);
    }
}
