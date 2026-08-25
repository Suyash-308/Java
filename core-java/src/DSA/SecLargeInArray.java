package DSA;

public class SecLargeInArray {
    public static void main(String[] args) {
        int[] arr={23,43,6,42,651,87,91};
        int max=Integer.MIN_VALUE;
        int secMax=max;

        for (int i =0; i <arr.length ; i++) {
            if (arr[i]>max){
                secMax=max;
                max=arr[i];
            } else if (arr[i] < max && arr[i]>secMax ) {
                secMax=arr[i];
            }
        }
        System.out.println("Max : "+max);
        System.out.println("secMax : "+secMax);
    }
}
