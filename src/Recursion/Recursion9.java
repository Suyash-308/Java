package Recursion;

public class Recursion9 {
    static void main() {
        int[] array = {1, 3,4,5,6};
        System.out.println(isSorted(array, 0));
    }
            public static boolean isSorted(int array[],int i){

            if (i==array.length-1){
                return true;
            }

            if (array[i]<array[i+1]){
               return isSorted(array,i+1);
            }else {
                return false;
            }
    }
}

