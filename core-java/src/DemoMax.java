public class DemoMax {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 4, 3};
        int max = Integer.MIN_VALUE;
        for (int a : arr) {
            if (max < a) {
                max = a;
            }
        }
        System.out.println(max);
    }
}

