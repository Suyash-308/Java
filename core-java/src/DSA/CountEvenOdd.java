package DSA;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr={12,53,46,96,85,40,87,90};
        int evenCount=0;
        int oddCount = 0;
        for (int a: arr){
            if (a%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("EvenCount : "+evenCount);
        System.out.println("OddCount : "+oddCount);
    }
}
