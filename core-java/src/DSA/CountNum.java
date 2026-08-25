package DSA;

public class CountNum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 10, 40};
        int count=0;

        for (int a : arr){
            if (a==10){
                count++;
            }
        }
        System.out.println(count);
    }
}
