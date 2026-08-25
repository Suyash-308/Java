package DSA;

public class CheckArraySort {
    public static void main(String[] args) {
        int[] arr ={23,53,63,54,68,75,97};
        boolean sorted=true;
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }
        System.out.println(sorted? "Sorted" : "Not Sorted");
    }
}
