package practice;

public class Demo13 {
    public static void main(String[] args) {
         String s="JAVA";
         String reverse=" ";
        for (int i =s.length()-1; i>=0 ; i--) {
            reverse+= s.charAt(i);
        }
        System.out.println(reverse);
    }
}
