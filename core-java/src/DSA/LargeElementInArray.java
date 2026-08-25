package DSA;

public class LargeElementInArray {
    public static void main(String[] args) {
        int[] arr={23,43,6,42,65,87,91,91};

        int max=arr[0];

        for (int i =1; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max : "+ max);
    }
}
