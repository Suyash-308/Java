package Recursion;

public class Recursion12 {
    public static void subSequence(String str,int i,String newStr){
        if (i==str.length()){
            System.out.println(newStr);
            return;
        }
        char currentChar=str.charAt(i);
        subSequence(str,i+1,newStr+currentChar);

        subSequence(str,i+1,newStr);

    }

    static void main() {
        String str="abc";
        subSequence(str,0,"");
    }
}
