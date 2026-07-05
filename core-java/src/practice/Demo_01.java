package practice;

public class Demo_01 {
    public static void main(String[] args) {
        int[] array={12,3,24,65,8,7};

        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum=sum+array[i];
        }
        System.out.println(sum);
    }
}
