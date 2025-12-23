public class DemoReverseNum {
    public static void main(String[] args) {
        int num = 1234;
        
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            System.out.print(digit);
        }

    }
}
