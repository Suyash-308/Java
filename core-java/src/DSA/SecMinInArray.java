package DSA;

public class SecMinInArray {
    public static void main(String[] args) {
        int[] arr={23,45,64,34,54,45,63,67,20,21};
        int min=Integer.MAX_VALUE;
        int secMin=min;
        for (int a:arr){
            if (a<min){
                secMin=min;
                min =a;
            } else if (a>min &&a<secMin) {
                secMin=a;
            }
        }
        System.out.println("Min : "+min);
        System.out.println("secMin : "+secMin);
    }
}
