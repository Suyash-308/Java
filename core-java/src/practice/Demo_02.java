package practice;

public class Demo_02 {
   public static void main(String[] args) {
        int[] array={12,3,42,5,46,87,5};

       for (int i = 0; i < array.length; i++) {
           if (array[i]%2==0){
               System.out.println(array[i]);
           }
       }
    }
}
