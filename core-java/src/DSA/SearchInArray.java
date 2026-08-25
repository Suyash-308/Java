package DSA;

public class SearchInArray {
    public static void main(String[] args) {
       int[] arr ={10, 20, 30, 40, 50};
        int element = 30;
        boolean isFound=false;

        for (int a:arr){
            if (a==element){
                isFound=true;
                break;
            }
        }
        System.out.println(isFound? "Element is found" : "Element is not found");
    }
}
