package practice;

public class Demo_03 {
    public static void main(String[] args){
        int[] array={2,4,32,45,76,87,6,7,};

        int max=array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
