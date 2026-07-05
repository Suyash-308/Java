package practice;

public class Demo_04 {
    public static void main(String[] args){
        int[] array={10, 20, 20,30, 30};

        int max=Integer.MIN_VALUE;
        int secMax=max;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>max){
                secMax=max;
                max=array[i];
            }else if (array[i]>secMax && array[i]<max ){
                secMax=array[i];
            }
        }

        System.out.println("Max : "+ max +" SecMax : "+secMax);
    }
}
