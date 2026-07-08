package practice;

public class Demo_05 {
    public static void main(String[] args){
        int[] array={12,3,54,6,79,5,9};

        int min=Integer.MAX_VALUE;
        int secMin=min;

        for (int i = 0; i <array.length ; i++) {
            if (array[i]<min  && array[i]<secMin){
                secMin=min;
                min=array[i];
            }else if (array[i]>min && array[i]<secMin){
                secMin=array[i];
            }
        }
        System.out.println("Min : "+min+ "\n" +"secMin : "+secMin);
    }
}
