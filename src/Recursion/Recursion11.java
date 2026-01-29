package Recursion;

public class Recursion11 {
    public static boolean[] map=new boolean[26];
    public static void removeDuplicate(String str,int i,String newStr){
        if (i==str.length()){
            System.out.println(newStr);
            return;
        }

        char currentChar=str.charAt(i);
        if (map[currentChar-'a']){
            removeDuplicate(str,i+1,newStr);
        }else {
            newStr+=currentChar;
            map[currentChar-'a']=true;
            removeDuplicate(str,i+1,newStr);
        }
    }

    static void main() {
        String str="abbbbcaadcc";
        removeDuplicate(str,0,"");
    }
}
