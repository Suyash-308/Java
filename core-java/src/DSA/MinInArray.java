package DSA;

public class MinInArray {
   public static void main(String[] args) {
        int[] arr={23,45,64,34,54,21,45,63,67,97};
        int min=Integer.MAX_VALUE;
        for (int a:arr){
            if (a<min){
                min =a;
            }
        }
       System.out.println("Min : "+min);
    }
}
