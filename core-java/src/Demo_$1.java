import practice.Student;

import java.util.Arrays;

public class Demo_$1 {
   public static void main(String[] args) {
       String str = "Hii";
       String str1 = "Hii";


       System.out.println(str.hashCode());
       System.out.println(str.concat(" Alice"));

       System.out.println(str.hashCode() == str1.hashCode());
       System.out.println(str.getClass());

   }
}
