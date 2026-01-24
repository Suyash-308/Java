public class Array3 {
    static void main() {
        int[] array={1,2,3,4,5,6};
        int left=0;
        int right=array.length-1;

        while (left<right){
            int temp=array[left];
            array [left] =array[right];
            array[right]=temp;

            left++;
            right--;
        }
        for (int a:array){
            System.out.println(a);
 }

    }
}
