package practice;

public class Demo_06 {
   public static void main(String[] args) {
       int[] arr={23,4,3,98,6,75,46};

       int min=Integer.MAX_VALUE;

       for (int a:arr){
           if (a<min){
               min=a;
           }
       }
       System.out.println("min : " + min);

    }
}
