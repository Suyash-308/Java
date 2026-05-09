package Sorting;

public class Demo4 {
    public static void main(String[] args){
        int [] array={2,4,3,5,1,7,6};
        for (int i = 0; i <array.length-1 ; i++) {
            int smallest=i;
            for (int j =i+1; j <array.length ; j++) {

                if (array[smallest]>array[j]){
                    smallest=j;
                }
            }
            int temp=array[smallest];
            array[smallest]=array[i];
            array[i]=temp;
        }
        printArray(array);
    }
    public static void printArray(int[] array){
        for (int j : array) {
            System.out.println(j);
        }
    }
}
