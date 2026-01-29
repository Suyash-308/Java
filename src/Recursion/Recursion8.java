package Recursion;

public class Recursion8 {
    static void main() {
        String str="abcd";
        int i=str.length()-1;
        reverseString(str,i);
    }
    public static void reverseString(String str,int i){
        if (i==0){
            System.out.println(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        reverseString(str,i-1 );
    }
}
