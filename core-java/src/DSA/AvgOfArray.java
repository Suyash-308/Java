package DSA;

public class AvgOfArray {
    public static void main(String[] args) {
        int[] arr={23,53,42,32,15,86};
        int sum=0;
        for (int a : arr){
           sum+=a;
        }
        double avg = (double) sum/arr.length;
        System.out.println(avg);
    }
}
